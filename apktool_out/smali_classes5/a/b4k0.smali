.class public final La/b4k0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic s:I


# instance fields
.field public final o:La/x3k0;

.field public final p:La/mne;

.field public final q:La/awu;

.field public r:La/c4m0;


# direct methods
.method public constructor <init>(La/vzg0;La/x3k0;La/mne;La/ctf0;La/awu;)V
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/hwi0;

    .line 5
    .line 6
    const/16 p1, 0x17

    .line 7
    .line 8
    invoke-direct {v2, p1}, La/hwi0;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/huh0;

    .line 12
    .line 13
    const/16 p1, 0x15

    .line 14
    .line 15
    invoke-direct {v3, p2, p4, p1}, La/huh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p3, La/mne;->c:La/vs10;

    .line 19
    .line 20
    invoke-static {p1, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v1, 0x0

    .line 26
    move-object v0, p0

    .line 27
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, v0, La/b4k0;->o:La/x3k0;

    .line 31
    .line 32
    iput-object p3, v0, La/b4k0;->p:La/mne;

    .line 33
    .line 34
    iput-object p5, v0, La/b4k0;->q:La/awu;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/v3k0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, La/t3k0;->a:La/t3k0;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, La/b4k0;->r:La/c4m0;

    .line 18
    .line 19
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object v0, La/u3k0;->a:La/u3k0;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object p1, p0, La/b4k0;->r:La/c4m0;

    .line 32
    .line 33
    invoke-static {p1}, La/v3c;->N(La/bby;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, La/b4k0;->o:La/x3k0;

    .line 37
    .line 38
    iget-object p1, p1, La/x3k0;->b:La/h3m0;

    .line 39
    .line 40
    sget-object v0, La/g3m0;->a:La/g3m0;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    const-class p1, La/gfb;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-object v0, La/f3m0;->a:La/f3m0;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    const-class p1, La/ffb;

    .line 60
    .line 61
    :goto_0
    iget-object v0, p0, La/b4k0;->q:La/awu;

    .line 62
    .line 63
    invoke-virtual {v0}, La/awu;->a()La/a1g;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v1, La/qkb0;

    .line 68
    .line 69
    const/16 v2, 0x15

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-direct {v1, p0, p1, v3, v2}, La/qkb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 73
    .line 74
    .line 75
    new-instance p1, La/fnq;

    .line 76
    .line 77
    const/4 v2, 0x4

    .line 78
    invoke-direct {p1, v0, v1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, La/b4k0;->p:La/mne;

    .line 82
    .line 83
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 84
    .line 85
    const/4 v1, 0x2

    .line 86
    invoke-static {p0, p1, v0, v3, v1}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, La/b4k0;->r:La/c4m0;

    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 98
    .line 99
    .line 100
    return-void
.end method
