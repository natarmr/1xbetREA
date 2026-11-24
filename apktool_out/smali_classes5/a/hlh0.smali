.class public final La/hlh0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic r:I


# instance fields
.field public final o:La/mne;

.field public final p:La/rsu;

.field public q:La/c4m0;


# direct methods
.method public constructor <init>(Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;La/ctf0;La/mne;La/rsu;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/owd;

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    invoke-direct {v2, p2, v0}, La/owd;-><init>(La/ctf0;B)V

    .line 8
    .line 9
    .line 10
    new-instance v3, La/dff0;

    .line 11
    .line 12
    const/16 v0, 0x19

    .line 13
    .line 14
    invoke-direct {v3, p2, p1, v0}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p3, La/mne;->a:La/rwj;

    .line 18
    .line 19
    invoke-static {p1, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v1, 0x0

    .line 25
    move-object v0, p0

    .line 26
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 27
    .line 28
    .line 29
    iput-object p3, v0, La/hlh0;->o:La/mne;

    .line 30
    .line 31
    iput-object p4, v0, La/hlh0;->p:La/rsu;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/ukh0;

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
    instance-of v0, p1, La/rkh0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    check-cast p1, La/rkh0;

    .line 15
    .line 16
    iget p1, p1, La/rkh0;->a:I

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    new-instance p1, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    const-string v1, ""

    .line 24
    .line 25
    invoke-direct {p1, v0, v1}, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;-><init>(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/elh0;

    .line 34
    .line 35
    iget-object v0, v0, La/elh0;->b:La/a4x;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    move-object v3, v2

    .line 52
    check-cast v3, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;

    .line 53
    .line 54
    iget v3, v3, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;->a:I

    .line 55
    .line 56
    if-ne v3, p1, :cond_1

    .line 57
    .line 58
    move-object v1, v2

    .line 59
    :cond_2
    move-object p1, v1

    .line 60
    check-cast p1, Lorg/xplatform/security/api/domain/models/SecretQuestionModel;

    .line 61
    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    new-instance v0, La/clh0;

    .line 66
    .line 67
    invoke-direct {v0, p1}, La/clh0;-><init>(Lorg/xplatform/security/api/domain/models/SecretQuestionModel;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    instance-of v0, p1, La/skh0;

    .line 75
    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    iget-object p1, p0, La/hlh0;->q:La/c4m0;

    .line 79
    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    const/4 v0, 0x1

    .line 87
    if-ne p1, v0, :cond_5

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    iget-object p1, p0, La/hlh0;->p:La/rsu;

    .line 91
    .line 92
    iget-object p1, p1, La/rsu;->a:La/n660;

    .line 93
    .line 94
    iget-object p1, p1, La/n660;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, La/hmh0;

    .line 97
    .line 98
    iget-object p1, p1, La/hmh0;->a:La/p7m0;

    .line 99
    .line 100
    new-instance v0, La/tye0;

    .line 101
    .line 102
    const/16 v2, 0x16

    .line 103
    .line 104
    invoke-direct {v0, p0, v1, v2}, La/tye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 105
    .line 106
    .line 107
    new-instance v1, La/fnq;

    .line 108
    .line 109
    const/4 v2, 0x4

    .line 110
    invoke-direct {v1, p1, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-object v0, p0, La/hlh0;->o:La/mne;

    .line 118
    .line 119
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 120
    .line 121
    invoke-static {p1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    sget-object v0, La/glh0;->h:La/glh0;

    .line 126
    .line 127
    invoke-static {v1, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iput-object p1, p0, La/hlh0;->q:La/c4m0;

    .line 132
    .line 133
    return-void

    .line 134
    :cond_6
    instance-of v0, p1, La/tkh0;

    .line 135
    .line 136
    if-eqz v0, :cond_7

    .line 137
    .line 138
    iget-object p0, p0, La/hlh0;->q:La/c4m0;

    .line 139
    .line 140
    if-eqz p0, :cond_8

    .line 141
    .line 142
    invoke-virtual {p0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_7
    instance-of p1, p1, La/qkh0;

    .line 147
    .line 148
    if-eqz p1, :cond_8

    .line 149
    .line 150
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 151
    .line 152
    .line 153
    :cond_8
    :goto_1
    return-void
.end method
