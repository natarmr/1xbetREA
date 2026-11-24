.class public interface abstract La/mc50;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La/mc50;Lkotlin/jvm/functions/Function0;)V
    .locals 3

    .line 1
    check-cast p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->a:Z

    .line 8
    .line 9
    iget-object v0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 10
    .line 11
    new-instance v1, La/dpl;

    .line 12
    .line 13
    const/16 v2, 0xf

    .line 14
    .line 15
    invoke-direct {v1, p0, p1, v2}, La/dpl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 19
    .line 20
    .line 21
    return-void
.end method
