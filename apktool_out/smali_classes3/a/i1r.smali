.class public final La/i1r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/tabbar/DsTabBar;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/i1r;->a:Landroid/widget/FrameLayout;

    .line 5
    .line 6
    iput-object p2, p0, La/i1r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/i1r;->a:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    return-object p0
.end method
