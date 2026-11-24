.class public abstract La/pj80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/database/DataSetObservable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/database/DataSetObservable;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/database/DataSetObservable;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/pj80;->a:Landroid/database/DataSetObservable;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Landroidx/viewpager/widget/ViewPager;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p3, Landroid/view/View;

    .line 5
    .line 6
    invoke-virtual {p1, p3}, Landroidx/viewpager/widget/ViewPager;->removeView(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract c()I
.end method

.method public abstract d(Landroidx/viewpager/widget/ViewPager;I)Ljava/lang/Object;
.end method

.method public e(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public f(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    return-void
.end method

.method public g()Landroid/os/Parcelable;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(Landroidx/viewpager/widget/ViewPager;)V
    .locals 0

    .line 1
    return-void
.end method
