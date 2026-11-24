.class public abstract La/kr00;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/ago;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ago;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/kr00;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/ugd;La/fet;I)V
    .locals 3

    .line 1
    const v0, 0x7fcadb14

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x3

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 17
    .line 18
    invoke-virtual {p1, v1, v0}, La/fet;->U(IZ)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    sget-object v0, La/kr00;->a:La/zfn;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const v0, 0x578e6142

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 42
    .line 43
    .line 44
    sget-object v0, La/bmd;->n:La/zfn;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/k6z;

    .line 51
    .line 52
    invoke-virtual {p1, v2}, La/fet;->r(Z)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const v0, 0x578f21eb

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v2}, La/fet;->r(Z)V

    .line 63
    .line 64
    .line 65
    sget-object v0, La/k6z;->a:La/k6z;

    .line 66
    .line 67
    :goto_1
    sget-object v1, La/bmd;->n:La/zfn;

    .line 68
    .line 69
    invoke-virtual {v1, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, La/w;

    .line 74
    .line 75
    const/16 v2, 0xf

    .line 76
    .line 77
    invoke-direct {v1, p0, v2}, La/w;-><init>(La/ugd;B)V

    .line 78
    .line 79
    .line 80
    const v2, 0x6e4e2e54

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const/16 v2, 0x38

    .line 88
    .line 89
    invoke-static {v0, v1, p1, v2}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    invoke-virtual {p1}, La/fet;->X()V

    .line 94
    .line 95
    .line 96
    :goto_2
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    new-instance v0, La/w;

    .line 103
    .line 104
    const/16 v1, 0x10

    .line 105
    .line 106
    invoke-direct {v0, p0, p2, v1}, La/w;-><init>(La/ugd;IB)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 110
    .line 111
    :cond_3
    return-void
.end method
