.class public final La/t4r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final a:Landroid/widget/LinearLayout;

.field public final b:Landroid/widget/ProgressBar;

.field public final c:Landroidx/recyclerview/widget/RecyclerView;

.field public final d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroidx/recyclerview/widget/RecyclerView;Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/t4r;->a:Landroid/widget/LinearLayout;

    .line 5
    .line 6
    iput-object p2, p0, La/t4r;->b:Landroid/widget/ProgressBar;

    .line 7
    .line 8
    iput-object p3, p0, La/t4r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    iput-object p4, p0, La/t4r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/t4r;->a:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    return-object p0
.end method
