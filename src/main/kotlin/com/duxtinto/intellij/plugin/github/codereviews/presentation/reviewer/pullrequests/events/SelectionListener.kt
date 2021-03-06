package com.duxtinto.intellij.plugin.github.codereviews.presentation.reviewer.pullrequests.events

import com.duxtinto.intellij.plugin.github.codereviews.domain.pullrequests.PullRequestEntity
import com.duxtinto.intellij.plugin.github.codereviews.domain.pullrequests.reviews.CodeReviewsByPullRequestInteractor
import com.duxtinto.intellij.plugin.github.codereviews.presentation.codereviews.CodeReviews
import com.duxtinto.intellij.plugin.github.codereviews.presentation.pullrequestlist.PullRequestList
import com.intellij.ui.table.TableView
import javax.inject.Inject
import javax.swing.event.ListSelectionEvent

class SelectionListener
    @Inject
    constructor()
    : PullRequestList.View.Events.SelectionListener {

    private var table: TableView<PullRequestEntity>? = null

    override fun setTable(table: TableView<PullRequestEntity>) {
        this.table = table
    }

    override fun valueChanged(event: ListSelectionEvent) {
        if ((table == null) ||
            event.valueIsAdjusting ||
            (table!!.selectedObjects.size != 1)) {
            return
        }
    }
}