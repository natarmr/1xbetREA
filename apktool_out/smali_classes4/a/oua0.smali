.class public final synthetic La/oua0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/Date;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/Date;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/oua0;->a:B

    iput-object p1, p0, La/oua0;->b:Ljava/util/Date;

    iput-wide p2, p0, La/oua0;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oua0;->a:B

    .line 4
    .line 5
    iget-wide v2, v0, La/oua0;->c:J

    .line 6
    .line 7
    iget-object v0, v0, La/oua0;->b:Ljava/util/Date;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/oyg0;

    .line 15
    .line 16
    move-object/from16 v4, p2

    .line 17
    .line 18
    check-cast v4, La/gua0;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v5, "KEY_TIME_FILTER_END"

    .line 35
    .line 36
    invoke-static {v1, v0, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v12, La/ghq0;

    .line 40
    .line 41
    iget-object v0, v4, La/gua0;->n:La/ghq0;

    .line 42
    .line 43
    iget-object v1, v0, La/ghq0;->a:La/ygq0;

    .line 44
    .line 45
    new-instance v5, La/wgq0;

    .line 46
    .line 47
    iget-object v0, v0, La/ghq0;->b:La/wgq0;

    .line 48
    .line 49
    iget-wide v6, v0, La/wgq0;->a:J

    .line 50
    .line 51
    invoke-direct {v5, v6, v7, v2, v3}, La/wgq0;-><init>(JJ)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v12, v1, v5}, La/ghq0;-><init>(La/ygq0;La/wgq0;)V

    .line 55
    .line 56
    .line 57
    const/4 v15, 0x0

    .line 58
    const v16, 0x1dfff

    .line 59
    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v10, 0x0

    .line 67
    const/4 v11, 0x0

    .line 68
    const/4 v13, 0x0

    .line 69
    const/4 v14, 0x0

    .line 70
    invoke-static/range {v4 .. v16}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    return-object v0

    .line 75
    :pswitch_0
    move-object/from16 v1, p1

    .line 76
    .line 77
    check-cast v1, La/oyg0;

    .line 78
    .line 79
    move-object/from16 v4, p2

    .line 80
    .line 81
    check-cast v4, La/gua0;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 90
    .line 91
    .line 92
    move-result-wide v5

    .line 93
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v5, "KEY_TIME_FILTER_START"

    .line 98
    .line 99
    invoke-static {v1, v0, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v12, La/ghq0;

    .line 103
    .line 104
    iget-object v0, v4, La/gua0;->n:La/ghq0;

    .line 105
    .line 106
    iget-object v1, v0, La/ghq0;->a:La/ygq0;

    .line 107
    .line 108
    new-instance v5, La/wgq0;

    .line 109
    .line 110
    iget-object v0, v0, La/ghq0;->b:La/wgq0;

    .line 111
    .line 112
    iget-wide v6, v0, La/wgq0;->b:J

    .line 113
    .line 114
    invoke-direct {v5, v2, v3, v6, v7}, La/wgq0;-><init>(JJ)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v12, v1, v5}, La/ghq0;-><init>(La/ygq0;La/wgq0;)V

    .line 118
    .line 119
    .line 120
    const/4 v15, 0x0

    .line 121
    const v16, 0x1dfff

    .line 122
    .line 123
    .line 124
    const/4 v5, 0x0

    .line 125
    const/4 v6, 0x0

    .line 126
    const/4 v7, 0x0

    .line 127
    const/4 v8, 0x0

    .line 128
    const/4 v9, 0x0

    .line 129
    const/4 v10, 0x0

    .line 130
    const/4 v11, 0x0

    .line 131
    const/4 v13, 0x0

    .line 132
    const/4 v14, 0x0

    .line 133
    invoke-static/range {v4 .. v16}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
