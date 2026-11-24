.class public final La/u2r0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/z2r0;

.field public final synthetic m:La/sip;

.field public final synthetic n:La/lie0;

.field public final synthetic o:La/hie0;

.field public final synthetic p:Z


# direct methods
.method public constructor <init>(La/yje;La/z2r0;La/sip;La/lie0;La/hie0;Z)V
    .locals 0

    .line 1
    iput-object p2, p0, La/u2r0;->l:La/z2r0;

    .line 2
    .line 3
    iput-object p3, p0, La/u2r0;->m:La/sip;

    .line 4
    .line 5
    iput-object p4, p0, La/u2r0;->n:La/lie0;

    .line 6
    .line 7
    iput-object p5, p0, La/u2r0;->o:La/hie0;

    .line 8
    .line 9
    iput-boolean p6, p0, La/u2r0;->p:Z

    .line 10
    .line 11
    const/4 p2, 0x3

    .line 12
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/u2r0;

    .line 7
    .line 8
    iget-object v5, p0, La/u2r0;->o:La/hie0;

    .line 9
    .line 10
    iget-boolean v6, p0, La/u2r0;->p:Z

    .line 11
    .line 12
    iget-object v2, p0, La/u2r0;->l:La/z2r0;

    .line 13
    .line 14
    iget-object v3, p0, La/u2r0;->m:La/sip;

    .line 15
    .line 16
    iget-object v4, p0, La/u2r0;->n:La/lie0;

    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, La/u2r0;-><init>(La/yje;La/z2r0;La/sip;La/lie0;La/hie0;Z)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/u2r0;->j:La/kmq;

    .line 22
    .line 23
    iput-object p2, v0, La/u2r0;->k:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, La/u2r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/u2r0;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v2

    .line 22
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, La/u2r0;->j:La/kmq;

    .line 26
    .line 27
    iget-object v1, p0, La/u2r0;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, La/j0g0;

    .line 30
    .line 31
    iget-object v7, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 32
    .line 33
    instance-of v1, v7, La/g0g0;

    .line 34
    .line 35
    iget-object v9, p0, La/u2r0;->o:La/hie0;

    .line 36
    .line 37
    iget-object v8, p0, La/u2r0;->n:La/lie0;

    .line 38
    .line 39
    iget-object v10, p0, La/u2r0;->l:La/z2r0;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    iget-object v1, v10, La/z2r0;->e:La/uyn;

    .line 44
    .line 45
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v1, v1, La/uyn;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, La/sb6;

    .line 53
    .line 54
    iget-object v1, v1, La/sb6;->b:La/yzn0;

    .line 55
    .line 56
    iget-object v5, p0, La/u2r0;->m:La/sip;

    .line 57
    .line 58
    invoke-virtual {v1, v4, v5}, La/yzn0;->h(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;)La/or30;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, La/or30;->b()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/util/List;

    .line 67
    .line 68
    if-nez v1, :cond_2

    .line 69
    .line 70
    sget-object v1, La/iun;->a:La/iun;

    .line 71
    .line 72
    :cond_2
    :goto_0
    move-object v6, v1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 75
    .line 76
    .line 77
    move-result-wide v4

    .line 78
    iput-wide v4, v8, La/lie0;->a:J

    .line 79
    .line 80
    iput-boolean v3, v9, La/hie0;->a:Z

    .line 81
    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    move-object v1, v2

    .line 85
    goto :goto_1

    .line 86
    :cond_4
    move-object v1, v7

    .line 87
    :goto_1
    check-cast v1, Ljava/util/List;

    .line 88
    .line 89
    if-nez v1, :cond_2

    .line 90
    .line 91
    sget-object v1, La/iun;->a:La/iun;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :goto_2
    new-instance v1, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_5

    .line 108
    .line 109
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    check-cast v5, La/b4r0;

    .line 114
    .line 115
    iget-object v5, v5, La/b4r0;->e:Ljava/util/List;

    .line 116
    .line 117
    invoke-static {v1, v5}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    iget-object v4, v10, La/z2r0;->a:La/v7i;

    .line 122
    .line 123
    iget-object v5, v10, La/z2r0;->c:La/pru;

    .line 124
    .line 125
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget-boolean v5, v5, La/sff0;->O1:Z

    .line 130
    .line 131
    iget-boolean v11, p0, La/u2r0;->p:Z

    .line 132
    .line 133
    invoke-virtual {v4, v1, v11, v5}, La/v7i;->k(Ljava/util/List;ZZ)La/acu;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    new-instance v4, La/y2r0;

    .line 138
    .line 139
    invoke-direct/range {v4 .. v10}, La/y2r0;-><init>(La/acu;Ljava/util/List;Ljava/lang/Object;La/lie0;La/hie0;La/z2r0;)V

    .line 140
    .line 141
    .line 142
    iput-object v2, p0, La/u2r0;->j:La/kmq;

    .line 143
    .line 144
    iput-object v2, p0, La/u2r0;->k:Ljava/lang/Object;

    .line 145
    .line 146
    iput-boolean v3, p0, La/u2r0;->i:Z

    .line 147
    .line 148
    invoke-static {p1, v4, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-ne p0, v0, :cond_6

    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_6
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object p0
.end method
