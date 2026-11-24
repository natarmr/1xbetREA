.class public final La/j6j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/j6j;->a:B

    iput-object p1, p0, La/j6j;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, La/j6j;->e:Landroid/widget/ImageView;

    iput-object p3, p0, La/j6j;->c:Landroid/widget/TextView;

    iput-object p4, p0, La/j6j;->d:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;B)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/j6j;->a:B

    iput-object p1, p0, La/j6j;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, La/j6j;->c:Landroid/widget/TextView;

    iput-object p3, p0, La/j6j;->e:Landroid/widget/ImageView;

    iput-object p4, p0, La/j6j;->d:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;B)V
    .locals 0

    .line 3
    iput-byte p5, p0, La/j6j;->a:B

    iput-object p1, p0, La/j6j;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, La/j6j;->c:Landroid/widget/TextView;

    iput-object p3, p0, La/j6j;->d:Landroid/widget/TextView;

    iput-object p4, p0, La/j6j;->e:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/view/View;)La/j6j;
    .locals 8

    .line 1
    const v0, 0x7f0a079e

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    move-object v4, v1

    .line 9
    check-cast v4, Landroid/widget/ImageView;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    const v0, 0x7f0a12f3

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v5, v1

    .line 21
    check-cast v5, Landroid/widget/TextView;

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    const v0, 0x7f0a12ff

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v6, v1

    .line 33
    check-cast v6, Landroid/widget/TextView;

    .line 34
    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    new-instance v2, La/j6j;

    .line 38
    .line 39
    move-object v3, p0

    .line 40
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 41
    .line 42
    const/4 v7, 0x6

    .line 43
    invoke-direct/range {v2 .. v7}, La/j6j;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string v0, "Missing required view with ID: "

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, La/j6j;->a:B

    iget-object p0, p0, La/j6j;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object p0
.end method
