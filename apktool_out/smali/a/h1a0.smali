.class public final synthetic La/h1a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:La/i26;

.field public final synthetic b:La/my90;

.field public final synthetic c:La/ccs0;

.field public final synthetic d:La/g1a0;


# direct methods
.method public synthetic constructor <init>(La/i26;La/my90;La/ccs0;La/g1a0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h1a0;->a:La/i26;

    iput-object p2, p0, La/h1a0;->b:La/my90;

    iput-object p3, p0, La/h1a0;->c:La/ccs0;

    iput-object p4, p0, La/h1a0;->d:La/g1a0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, La/h1a0;->b:La/my90;

    .line 2
    .line 3
    check-cast p1, La/ulo;

    .line 4
    .line 5
    const/16 v0, 0x1d

    .line 6
    .line 7
    invoke-virtual {p1, v0}, La/ulo;->w(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p1}, La/ulo;->v()La/scs0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/nyj;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v1, La/myj;

    .line 24
    .line 25
    invoke-direct {v1, v0}, La/myj;-><init>(La/nyj;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, La/pcs0;

    .line 29
    .line 30
    iget-object v2, p0, La/h1a0;->d:La/g1a0;

    .line 31
    .line 32
    iget v3, v2, La/g1a0;->b:I

    .line 33
    .line 34
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v4, p0, La/h1a0;->c:La/ccs0;

    .line 43
    .line 44
    invoke-direct {v0, v4, v3}, La/pcs0;-><init>(La/ccs0;Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, La/myj;->e(La/pcs0;)La/rcs0;

    .line 48
    .line 49
    .line 50
    iget-object v0, v2, La/g1a0;->a:La/qds0;

    .line 51
    .line 52
    iget-object v0, v0, La/qds0;->b:La/ccs0;

    .line 53
    .line 54
    iget v0, v0, La/ccs0;->c:I

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-virtual {v1, v0, v3}, La/rcs0;->i(IZ)La/rcs0;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, La/rcs0;->a()La/scs0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1, v0}, La/ulo;->R(La/scs0;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v2, La/g1a0;->c:Ljava/lang/String;

    .line 68
    .line 69
    iget-object p0, p0, La/h1a0;->a:La/i26;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, La/i26;->F(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, La/i26;->f:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Landroidx/media3/ui/PlayerControlView;

    .line 77
    .line 78
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->r:Landroid/widget/PopupWindow;

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 81
    .line 82
    .line 83
    return-void
.end method
