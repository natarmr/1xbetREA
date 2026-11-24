.class public final synthetic La/hd7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JJLjava/lang/Object;ZB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/hd7;->a:B

    iput-object p1, p0, La/hd7;->e:Ljava/lang/Object;

    iput-wide p2, p0, La/hd7;->b:J

    iput-wide p4, p0, La/hd7;->c:J

    iput-object p6, p0, La/hd7;->f:Ljava/lang/Object;

    iput-boolean p7, p0, La/hd7;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hd7;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/hd7;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/hd7;->e:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, La/q5w;

    .line 13
    .line 14
    check-cast v2, La/uv6;

    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, La/k0w0;

    .line 19
    .line 20
    iget-object v3, v3, La/q5w;->f:La/qv2;

    .line 21
    .line 22
    sget-object v17, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 23
    .line 24
    sget-object v18, La/grs;->b:La/grs;

    .line 25
    .line 26
    sget-object v21, La/ors;->a:La/ors;

    .line 27
    .line 28
    sget-object v24, La/k1g;->h:La/k1g;

    .line 29
    .line 30
    iget-wide v9, v2, La/uv6;->t:J

    .line 31
    .line 32
    iget v4, v2, La/uv6;->I:I

    .line 33
    .line 34
    int-to-long v11, v4

    .line 35
    iget-wide v14, v2, La/uv6;->a:J

    .line 36
    .line 37
    iget-boolean v2, v2, La/uv6;->l:Z

    .line 38
    .line 39
    new-instance v4, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 40
    .line 41
    iget-wide v5, v0, La/hd7;->b:J

    .line 42
    .line 43
    iget-wide v7, v0, La/hd7;->c:J

    .line 44
    .line 45
    iget-boolean v13, v0, La/hd7;->d:Z

    .line 46
    .line 47
    const-string v19, "main_screen"

    .line 48
    .line 49
    const-string v20, ""

    .line 50
    .line 51
    const/16 v22, 0x0

    .line 52
    .line 53
    const/16 v23, 0x0

    .line 54
    .line 55
    move/from16 v16, v2

    .line 56
    .line 57
    invoke-direct/range {v4 .. v24}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v4}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 65
    .line 66
    .line 67
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_0
    check-cast v3, La/kd7;

    .line 71
    .line 72
    check-cast v2, La/z0w;

    .line 73
    .line 74
    move-object/from16 v1, p1

    .line 75
    .line 76
    check-cast v1, La/k0w0;

    .line 77
    .line 78
    iget-object v3, v3, La/kd7;->X:La/qv2;

    .line 79
    .line 80
    sget-object v17, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 81
    .line 82
    sget-object v18, La/grs;->b:La/grs;

    .line 83
    .line 84
    sget-object v21, La/ors;->a:La/ors;

    .line 85
    .line 86
    sget-object v24, La/k1g;->h:La/k1g;

    .line 87
    .line 88
    iget-wide v9, v2, La/z0w;->t:J

    .line 89
    .line 90
    iget v4, v2, La/z0w;->I:I

    .line 91
    .line 92
    int-to-long v11, v4

    .line 93
    iget-wide v14, v2, La/z0w;->a:J

    .line 94
    .line 95
    iget-boolean v2, v2, La/z0w;->l:Z

    .line 96
    .line 97
    new-instance v4, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 98
    .line 99
    const/16 v22, 0x0

    .line 100
    .line 101
    const/16 v23, 0x0

    .line 102
    .line 103
    iget-wide v5, v0, La/hd7;->b:J

    .line 104
    .line 105
    iget-wide v7, v0, La/hd7;->c:J

    .line 106
    .line 107
    iget-boolean v13, v0, La/hd7;->d:Z

    .line 108
    .line 109
    const-string v19, "main_screen"

    .line 110
    .line 111
    const-string v20, ""

    .line 112
    .line 113
    move/from16 v16, v2

    .line 114
    .line 115
    invoke-direct/range {v4 .. v24}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v4}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 123
    .line 124
    .line 125
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object v0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
