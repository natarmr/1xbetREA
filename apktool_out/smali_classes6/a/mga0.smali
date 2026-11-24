.class public final synthetic La/mga0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/vj50;

.field public final synthetic c:F

.field public final synthetic d:La/xcz;

.field public final synthetic e:La/a4x;

.field public final synthetic f:La/k6z;

.field public final synthetic g:Z

.field public final synthetic h:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/pga0;FLa/xcz;La/a4x;La/k6z;ZLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mga0;->a:La/mm40;

    iput-object p2, p0, La/mga0;->b:La/vj50;

    iput p3, p0, La/mga0;->c:F

    iput-object p4, p0, La/mga0;->d:La/xcz;

    iput-object p5, p0, La/mga0;->e:La/a4x;

    iput-object p6, p0, La/mga0;->f:La/k6z;

    iput-boolean p7, p0, La/mga0;->g:Z

    iput-object p8, p0, La/mga0;->h:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq p2, v0, :cond_0

    .line 15
    .line 16
    move p2, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p2, 0x0

    .line 19
    :goto_0
    and-int/2addr p1, v1

    .line 20
    invoke-virtual {v9, p1, p2}, La/fet;->U(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    iget-object p2, p0, La/mga0;->a:La/mm40;

    .line 28
    .line 29
    iget-object v0, p0, La/mga0;->b:La/vj50;

    .line 30
    .line 31
    invoke-static {p2, v0, p1}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object p1, La/qmk;->a:La/zcl;

    .line 36
    .line 37
    const/high16 p1, 0x41c00000    # 24.0f

    .line 38
    .line 39
    const/4 p2, 0x5

    .line 40
    const/4 v1, 0x0

    .line 41
    iget v2, p0, La/mga0;->c:F

    .line 42
    .line 43
    invoke-static {v1, v2, v1, p1, p2}, La/s5x0;->u(FFFFI)La/lh80;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v4, p0, La/mga0;->e:La/a4x;

    .line 48
    .line 49
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iget-object v5, p0, La/mga0;->f:La/k6z;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {v9, p2}, La/fet;->e(I)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    or-int/2addr p1, p2

    .line 64
    iget-boolean v6, p0, La/mga0;->g:Z

    .line 65
    .line 66
    invoke-virtual {v9, v6}, La/fet;->h(Z)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    or-int/2addr p1, p2

    .line 71
    iget-object v7, p0, La/mga0;->h:Lkotlin/jvm/functions/Function1;

    .line 72
    .line 73
    invoke-virtual {v9, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    or-int/2addr p1, p2

    .line 78
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    if-nez p1, :cond_1

    .line 83
    .line 84
    sget-object p1, La/ukd;->a:La/cl5;

    .line 85
    .line 86
    if-ne p2, p1, :cond_2

    .line 87
    .line 88
    :cond_1
    new-instance v3, La/t13;

    .line 89
    .line 90
    const/16 v8, 0x11

    .line 91
    .line 92
    invoke-direct/range {v3 .. v8}, La/t13;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object p2, v3

    .line 99
    :cond_2
    move-object v8, p2

    .line 100
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 101
    .line 102
    const/high16 v10, 0x6000000

    .line 103
    .line 104
    const/16 v11, 0xf8

    .line 105
    .line 106
    iget-object v1, p0, La/mga0;->d:La/xcz;

    .line 107
    .line 108
    const/4 v3, 0x0

    .line 109
    const/4 v4, 0x0

    .line 110
    const/4 v5, 0x0

    .line 111
    const/4 v6, 0x0

    .line 112
    const/4 v7, 0x0

    .line 113
    invoke-static/range {v0 .. v11}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    invoke-virtual {v9}, La/fet;->X()V

    .line 118
    .line 119
    .line 120
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0
.end method
