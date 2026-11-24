.class public final synthetic La/lu70;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/lu70;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/lu70;

    .line 2
    .line 3
    const-string v4, "toOnlineCallUiState(Lorg/xplatform/feature/online_call/impl/presentation/model/OnlineCallState;)Lorg/xplatform/feature/online_call/impl/presentation/model/OnlineCallUiState;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/ju70;

    .line 8
    .line 9
    const-string v3, "toOnlineCallUiState"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/lu70;->a:La/lu70;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/hu70;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-boolean v2, v0, La/hu70;->c:Z

    .line 9
    .line 10
    iget-boolean v3, v0, La/hu70;->d:Z

    .line 11
    .line 12
    iget-boolean v5, v0, La/hu70;->f:Z

    .line 13
    .line 14
    iget-boolean v6, v0, La/hu70;->g:Z

    .line 15
    .line 16
    iget-boolean v7, v0, La/hu70;->h:Z

    .line 17
    .line 18
    iget-boolean v9, v0, La/hu70;->j:Z

    .line 19
    .line 20
    iget-boolean v10, v0, La/hu70;->k:Z

    .line 21
    .line 22
    iget-object v11, v0, La/hu70;->l:Ljava/lang/String;

    .line 23
    .line 24
    iget-boolean v12, v0, La/hu70;->n:Z

    .line 25
    .line 26
    iget-boolean v13, v0, La/hu70;->o:Z

    .line 27
    .line 28
    iget-object v1, v0, La/hu70;->t:La/suy;

    .line 29
    .line 30
    iget-object v1, v1, La/suy;->a:La/wuy;

    .line 31
    .line 32
    sget-object v4, La/wuy;->d:La/wuy;

    .line 33
    .line 34
    if-eq v1, v4, :cond_1

    .line 35
    .line 36
    if-nez v12, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const/4 v1, 0x0

    .line 40
    :goto_0
    move v14, v1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    const/4 v1, 0x1

    .line 43
    goto :goto_0

    .line 44
    :goto_2
    iget-boolean v15, v0, La/hu70;->q:Z

    .line 45
    .line 46
    iget-object v1, v0, La/hu70;->p:Ljava/lang/String;

    .line 47
    .line 48
    iget-boolean v4, v0, La/hu70;->s:Z

    .line 49
    .line 50
    iget-boolean v8, v0, La/hu70;->i:Z

    .line 51
    .line 52
    move/from16 v17, v4

    .line 53
    .line 54
    iget-boolean v4, v0, La/hu70;->e:Z

    .line 55
    .line 56
    iget-boolean v0, v0, La/hu70;->u:Z

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    const v16, 0x7f130ec9

    .line 61
    .line 62
    .line 63
    :goto_3
    move/from16 v19, v16

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_2
    const v16, 0x7f130eca

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :goto_4
    if-eqz v5, :cond_3

    .line 71
    .line 72
    const v16, 0x7f08098e

    .line 73
    .line 74
    .line 75
    :goto_5
    move/from16 v20, v16

    .line 76
    .line 77
    goto :goto_6

    .line 78
    :cond_3
    const v16, 0x7f08098d

    .line 79
    .line 80
    .line 81
    goto :goto_5

    .line 82
    :goto_6
    if-eqz v6, :cond_4

    .line 83
    .line 84
    const v16, 0x7f080cad

    .line 85
    .line 86
    .line 87
    :goto_7
    move/from16 v21, v16

    .line 88
    .line 89
    goto :goto_8

    .line 90
    :cond_4
    const v16, 0x7f080cae

    .line 91
    .line 92
    .line 93
    goto :goto_7

    .line 94
    :goto_8
    if-eqz v7, :cond_5

    .line 95
    .line 96
    const v16, 0x7f0806a9

    .line 97
    .line 98
    .line 99
    :goto_9
    move/from16 v22, v16

    .line 100
    .line 101
    move-object/from16 v16, v1

    .line 102
    .line 103
    goto :goto_a

    .line 104
    :cond_5
    const v16, 0x7f0806a1

    .line 105
    .line 106
    .line 107
    goto :goto_9

    .line 108
    :goto_a
    new-instance v1, La/iu70;

    .line 109
    .line 110
    move/from16 v18, v0

    .line 111
    .line 112
    invoke-direct/range {v1 .. v22}, La/iu70;-><init>(ZZZZZZZZZLjava/lang/String;ZZZZLjava/lang/String;ZZIIII)V

    .line 113
    .line 114
    .line 115
    return-object v1
.end method
