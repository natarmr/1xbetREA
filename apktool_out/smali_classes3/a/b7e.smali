.class public final La/b7e;
.super La/lhe0;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/e7e;

.field public final synthetic b:Landroid/widget/ImageView;

.field public final synthetic c:Landroid/widget/TextView;

.field public final synthetic d:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(La/e7e;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/b7e;->a:La/e7e;

    .line 5
    .line 6
    iput-object p2, p0, La/b7e;->b:Landroid/widget/ImageView;

    .line 7
    .line 8
    iput-object p3, p0, La/b7e;->c:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p4, p0, La/b7e;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 6

    .line 1
    sget-object p1, La/e7e;->d2:La/kwd;

    .line 2
    .line 3
    new-instance v0, La/hf5;

    .line 4
    .line 5
    const/4 v5, 0x4

    .line 6
    iget-object v1, p0, La/b7e;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v2, p0, La/b7e;->a:La/e7e;

    .line 9
    .line 10
    iget-object v3, p0, La/b7e;->b:Landroid/widget/ImageView;

    .line 11
    .line 12
    iget-object v4, p0, La/b7e;->c:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, La/hf5;-><init>(Landroid/view/View;Ljava/lang/Object;Landroid/view/View;Landroid/view/View;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v0}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
