.class public final La/yo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ry9;


# instance fields
.field public final b:La/ry9;

.field public final synthetic c:B

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/ry9;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/yo;->c:B

    .line 11
    invoke-direct {p0, p1, v0}, La/yo;-><init>(La/ry9;B)V

    .line 12
    iput-object p1, p0, La/yo;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ry9;B)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, La/yo;->b:La/ry9;

    return-void
.end method

.method public constructor <init>(La/ry9;La/b0l0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/yo;->c:B

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, La/yo;-><init>(La/ry9;B)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, La/yo;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, La/yo;->b:La/ry9;

    .line 2
    .line 3
    invoke-interface {p0}, La/ry9;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(La/tii0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/yo;->b:La/ry9;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/ry9;->b(La/tii0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(La/srn;)La/ig00;
    .locals 1

    .line 1
    iget-byte v0, p0, La/yo;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/yo;->b:La/ry9;

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/ry9;->c(La/srn;)La/ig00;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    iget-object p0, p0, La/yo;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/ry9;

    .line 16
    .line 17
    invoke-interface {p0, p1}, La/ry9;->c(La/srn;)La/ig00;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(F)La/ig00;
    .locals 1

    .line 1
    iget-byte v0, p0, La/yo;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/yo;->b:La/ry9;

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/ry9;->d(F)La/ig00;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    iget-object p0, p0, La/yo;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/ry9;

    .line 16
    .line 17
    invoke-interface {p0, p1}, La/ry9;->d(F)La/ig00;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/yo;->b:La/ry9;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/ry9;->e(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()La/drd;
    .locals 0

    .line 1
    iget-object p0, p0, La/yo;->b:La/ry9;

    .line 2
    .line 3
    invoke-interface {p0}, La/ry9;->f()La/drd;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final g(La/drd;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/yo;->b:La/ry9;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/ry9;->g(La/drd;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(Ljava/util/ArrayList;II)La/ig00;
    .locals 4

    .line 1
    iget-byte v0, p0, La/yo;->c:B

    .line 2
    .line 3
    iget-object v1, p0, La/yo;->b:La/ry9;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v1, p1, p2, p3}, La/ry9;->h(Ljava/util/ArrayList;II)La/ig00;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    const/4 v0, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ne p3, v2, :cond_0

    .line 20
    .line 21
    move p3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p3, v0

    .line 24
    :goto_0
    const-string v3, "Only support one capture config."

    .line 25
    .line 26
    invoke-static {v3, p3}, La/z1x;->t(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, p2}, La/ry9;->j(I)La/ig00;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    instance-of p3, p2, La/dfr;

    .line 34
    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    move-object p3, p2

    .line 38
    check-cast p3, La/dfr;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p3, La/dfr;

    .line 42
    .line 43
    invoke-direct {p3, p2}, La/dfr;-><init>(La/ig00;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    new-instance v1, La/gnu0;

    .line 47
    .line 48
    invoke-direct {v1, p2, v0}, La/gnu0;-><init>(La/ig00;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {p3, v1, v0}, La/ro4;->k0(La/ig00;La/zy3;Ljava/util/concurrent/Executor;)La/qbb;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    new-instance v0, La/lmn0;

    .line 60
    .line 61
    const/4 v1, 0x6

    .line 62
    invoke-direct {v0, p0, p1, v1}, La/lmn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p3, v0, p0}, La/ro4;->k0(La/ig00;La/zy3;Ljava/util/concurrent/Executor;)La/qbb;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance p1, La/gnu0;

    .line 74
    .line 75
    invoke-direct {p1, p2, v2}, La/gnu0;-><init>(La/ig00;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-static {p0, p1, p2}, La/ro4;->k0(La/ig00;La/zy3;Ljava/util/concurrent/Executor;)La/qbb;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    new-instance p1, La/gd00;

    .line 91
    .line 92
    new-instance p2, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {p2, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-direct {p1, p2, v2, p0}, La/gd00;-><init>(Ljava/util/ArrayList;ZLa/bnk;)V

    .line 102
    .line 103
    .line 104
    return-object p1

    .line 105
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final i()V
    .locals 0

    .line 1
    iget-object p0, p0, La/yo;->b:La/ry9;

    .line 2
    .line 3
    invoke-interface {p0}, La/ry9;->i()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j(I)La/ig00;
    .locals 0

    .line 1
    iget-object p0, p0, La/yo;->b:La/ry9;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/ry9;->j(I)La/ig00;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final k(La/kzw;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/yo;->b:La/ry9;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/ry9;->k(La/kzw;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
