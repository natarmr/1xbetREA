.class public final La/jwr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Landroid/view/ViewParent;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/ViewParent;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jwr0;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, La/jwr0;->b:Landroid/view/ViewParent;

    .line 7
    .line 8
    iput-object p3, p0, La/jwr0;->c:Landroid/view/View;

    .line 9
    .line 10
    iput p4, p0, La/jwr0;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/jwr0;->a:Landroid/view/View;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, La/jwr0;->b:Landroid/view/ViewParent;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Landroid/view/View;

    .line 16
    .line 17
    new-instance v1, La/le3;

    .line 18
    .line 19
    iget-object v2, p0, La/jwr0;->c:Landroid/view/View;

    .line 20
    .line 21
    iget p0, p0, La/jwr0;->d:I

    .line 22
    .line 23
    invoke-direct {v1, p0, v2, p1}, La/le3;-><init>(ILandroid/view/View;Landroid/view/ViewParent;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
