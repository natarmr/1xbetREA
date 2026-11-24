.class public final La/ebm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:Lkotlin/jvm/functions/Function2;

.field public final synthetic e:La/jbm;


# direct methods
.method public constructor <init>(Ljava/util/List;ZJLkotlin/jvm/functions/Function2;La/jbm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ebm;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-boolean p2, p0, La/ebm;->b:Z

    .line 7
    .line 8
    iput-wide p3, p0, La/ebm;->c:J

    .line 9
    .line 10
    iput-object p5, p0, La/ebm;->d:Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    iput-object p6, p0, La/ebm;->e:La/jbm;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/g9z;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    move-object v5, p3

    .line 10
    check-cast v5, La/fet;

    .line 11
    .line 12
    check-cast p4, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    and-int/lit8 p4, p3, 0x6

    .line 19
    .line 20
    if-nez p4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v5, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x2

    .line 31
    :goto_0
    or-int/2addr p1, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p1, p3

    .line 34
    :goto_1
    and-int/lit8 p3, p3, 0x30

    .line 35
    .line 36
    if-nez p3, :cond_3

    .line 37
    .line 38
    invoke-virtual {v5, p2}, La/fet;->e(I)Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    const/16 p3, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 p3, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr p1, p3

    .line 50
    :cond_3
    and-int/lit16 p3, p1, 0x93

    .line 51
    .line 52
    const/16 p4, 0x92

    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v0, 0x1

    .line 56
    if-eq p3, p4, :cond_4

    .line 57
    .line 58
    move p3, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move p3, v7

    .line 61
    :goto_3
    and-int/2addr p1, v0

    .line 62
    invoke-virtual {v5, p1, p3}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_7

    .line 67
    .line 68
    iget-object p1, p0, La/ebm;->a:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, La/ibm;

    .line 75
    .line 76
    const p2, -0x22e33925

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, p2}, La/fet;->e0(I)V

    .line 80
    .line 81
    .line 82
    iget-object p2, p0, La/ebm;->d:Lkotlin/jvm/functions/Function2;

    .line 83
    .line 84
    invoke-virtual {v5, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    iget-object p4, p0, La/ebm;->e:La/jbm;

    .line 89
    .line 90
    invoke-virtual {v5, p4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    or-int/2addr p3, v1

    .line 95
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-nez p3, :cond_5

    .line 100
    .line 101
    sget-object p3, La/ukd;->a:La/cl5;

    .line 102
    .line 103
    if-ne v1, p3, :cond_6

    .line 104
    .line 105
    :cond_5
    new-instance v1, La/dbm;

    .line 106
    .line 107
    invoke-direct {v1, p2, p4, v0}, La/dbm;-><init>(Lkotlin/jvm/functions/Function2;La/jbm;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    move-object v4, v1

    .line 114
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 115
    .line 116
    const/4 v6, 0x0

    .line 117
    iget-boolean v1, p0, La/ebm;->b:Z

    .line 118
    .line 119
    iget-wide v2, p0, La/ebm;->c:J

    .line 120
    .line 121
    move-object v0, p1

    .line 122
    invoke-static/range {v0 .. v6}, La/x4d0;->B(La/ibm;ZJLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v7}, La/fet;->r(Z)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    invoke-virtual {v5}, La/fet;->X()V

    .line 130
    .line 131
    .line 132
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0
.end method
