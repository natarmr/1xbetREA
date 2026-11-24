.class public final La/mxk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/nxk0;

.field public final synthetic k:Lokhttp3/internal/http/RealInterceptorChain;


# direct methods
.method public constructor <init>(La/nxk0;Lokhttp3/internal/http/RealInterceptorChain;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mxk0;->j:La/nxk0;

    .line 2
    .line 3
    iput-object p2, p0, La/mxk0;->k:Lokhttp3/internal/http/RealInterceptorChain;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, La/mxk0;

    .line 2
    .line 3
    iget-object v0, p0, La/mxk0;->j:La/nxk0;

    .line 4
    .line 5
    iget-object p0, p0, La/mxk0;->k:Lokhttp3/internal/http/RealInterceptorChain;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/mxk0;-><init>(La/nxk0;Lokhttp3/internal/http/RealInterceptorChain;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/mxk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/mxk0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/mxk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v12, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v0, p0, La/mxk0;->i:Z

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return-object v0

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, La/mxk0;->j:La/nxk0;

    .line 25
    .line 26
    iget-object v0, v0, La/nxk0;->a:La/wdu;

    .line 27
    .line 28
    iget-object v2, p0, La/mxk0;->k:Lokhttp3/internal/http/RealInterceptorChain;

    .line 29
    .line 30
    iget-object v2, v2, Lokhttp3/internal/http/RealInterceptorChain;->e:Lokhttp3/Request;

    .line 31
    .line 32
    iput-boolean v1, p0, La/mxk0;->i:Z

    .line 33
    .line 34
    iget-object v1, v0, La/wdu;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, La/owp0;

    .line 37
    .line 38
    iget-object v3, v0, La/wdu;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, La/n4u;

    .line 41
    .line 42
    invoke-virtual {v3}, La/n4u;->e()V

    .line 43
    .line 44
    .line 45
    iget-object v3, v0, La/wdu;->h:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, La/hru;

    .line 48
    .line 49
    iget-object v3, v3, La/hru;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, La/yk50;

    .line 52
    .line 53
    iget-object v3, v3, La/yk50;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, La/knf0;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v3, v0, La/wdu;->e:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, La/aqt;

    .line 63
    .line 64
    invoke-virtual {v3}, La/aqt;->a()V

    .line 65
    .line 66
    .line 67
    iget-object v3, v0, La/wdu;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, La/viu;

    .line 70
    .line 71
    iget-object v3, v3, La/viu;->a:La/ieu;

    .line 72
    .line 73
    invoke-virtual {v3}, La/ieu;->b()J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    iget-object v3, v0, La/wdu;->i:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, La/db9;

    .line 80
    .line 81
    iget-object v3, v3, La/db9;->a:La/yk50;

    .line 82
    .line 83
    iget-object v3, v3, La/yk50;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, La/knf0;

    .line 86
    .line 87
    invoke-virtual {v3}, La/knf0;->a()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    iget-object v3, v0, La/wdu;->j:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v3, La/yfu;

    .line 94
    .line 95
    invoke-virtual {v3}, La/yfu;->j()V

    .line 96
    .line 97
    .line 98
    iget-object v3, v0, La/wdu;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, La/x4u;

    .line 101
    .line 102
    iget-object v3, v3, La/x4u;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v3, La/nr00;

    .line 105
    .line 106
    iget-object v3, v3, La/nr00;->a:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, La/knf0;

    .line 109
    .line 110
    invoke-virtual {v3}, La/knf0;->b()I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    iget-object v0, v0, La/wdu;->f:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, La/cmt;

    .line 117
    .line 118
    iget-object v0, v0, La/cmt;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, La/peg0;

    .line 121
    .line 122
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, La/us3;

    .line 125
    .line 126
    invoke-virtual {v0}, La/us3;->c()La/go3;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, La/go3;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    move-object v0, v1

    .line 135
    move-object v1, v2

    .line 136
    const/16 v2, 0x54d

    .line 137
    .line 138
    const/16 v3, 0x16

    .line 139
    .line 140
    const-string v4, "org.xbet.client1"

    .line 141
    .line 142
    const/4 v8, 0x1

    .line 143
    move-object v11, p0

    .line 144
    invoke-virtual/range {v0 .. v11}, La/owp0;->f(Lokhttp3/Request;IILjava/lang/String;JLjava/lang/String;IILjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-ne v0, v12, :cond_2

    .line 149
    .line 150
    return-object v12

    .line 151
    :cond_2
    return-object v0
.end method
