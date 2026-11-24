.class public final synthetic La/byj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/l7m0;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(La/l7m0;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/byj;->a:La/l7m0;

    iput-wide p2, p0, La/byj;->b:J

    iput-wide p4, p0, La/byj;->c:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/byj;->a:La/l7m0;

    .line 2
    .line 3
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/gkw;

    .line 8
    .line 9
    iget-wide v7, p0, La/byj;->b:J

    .line 10
    .line 11
    sget-object v6, La/ra50;->a:La/ra50;

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    const/4 v10, 0x1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-boolean v1, v1, La/gkw;->f:Z

    .line 18
    .line 19
    if-ne v1, v10, :cond_0

    .line 20
    .line 21
    new-instance v2, La/wkm;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    const/4 v5, 0x1

    .line 25
    const v4, 0x7f0807f8

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v2 .. v8}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 29
    .line 30
    .line 31
    move-object v1, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v1, v9

    .line 34
    :goto_0
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, La/gkw;

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    iget-boolean v2, v2, La/gkw;->d:Z

    .line 43
    .line 44
    if-ne v2, v10, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/gkw;

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-boolean v0, v0, La/gkw;->e:Z

    .line 55
    .line 56
    if-ne v0, v10, :cond_1

    .line 57
    .line 58
    new-instance v6, La/pa50;

    .line 59
    .line 60
    new-instance v0, La/pf5;

    .line 61
    .line 62
    new-instance v2, La/y3d;

    .line 63
    .line 64
    iget-wide v3, p0, La/byj;->c:J

    .line 65
    .line 66
    invoke-direct {v2, v3, v4}, La/y3d;-><init>(J)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x2

    .line 70
    invoke-direct {v0, p0, v2}, La/pf5;-><init>(ILa/y3d;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v6, v0}, La/pa50;-><init>(La/uf5;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    new-instance v2, La/wkm;

    .line 77
    .line 78
    const/4 v3, 0x2

    .line 79
    const/4 v5, 0x1

    .line 80
    const v4, 0x7f080925

    .line 81
    .line 82
    .line 83
    invoke-direct/range {v2 .. v8}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 84
    .line 85
    .line 86
    move-object v9, v2

    .line 87
    :cond_2
    if-eqz v1, :cond_3

    .line 88
    .line 89
    if-eqz v9, :cond_3

    .line 90
    .line 91
    new-instance p0, La/dmm;

    .line 92
    .line 93
    new-instance v0, La/va50;

    .line 94
    .line 95
    invoke-direct {v0, v1, v9}, La/va50;-><init>(La/wkm;La/wkm;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p0, v0}, La/dmm;-><init>(La/wa50;)V

    .line 99
    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_3
    if-eqz v1, :cond_4

    .line 103
    .line 104
    new-instance p0, La/dmm;

    .line 105
    .line 106
    new-instance v0, La/ta50;

    .line 107
    .line 108
    invoke-direct {v0, v1}, La/ta50;-><init>(La/wkm;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {p0, v0}, La/dmm;-><init>(La/wa50;)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_4
    if-eqz v9, :cond_5

    .line 116
    .line 117
    new-instance p0, La/dmm;

    .line 118
    .line 119
    new-instance v0, La/ta50;

    .line 120
    .line 121
    invoke-direct {v0, v9}, La/ta50;-><init>(La/wkm;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {p0, v0}, La/dmm;-><init>(La/wa50;)V

    .line 125
    .line 126
    .line 127
    return-object p0

    .line 128
    :cond_5
    sget-object p0, La/fmm;->a:La/fmm;

    .line 129
    .line 130
    return-object p0
.end method
