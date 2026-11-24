.class public final synthetic La/wuh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qzt;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:La/fhj;

.field public final synthetic e:J

.field public final synthetic f:La/wyu;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLa/qzt;La/ctf0;La/fhj;Ljava/lang/String;La/wyu;La/pru;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/wuh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/wuh;->e:J

    iput-object p3, p0, La/wuh;->b:La/qzt;

    iput-object p4, p0, La/wuh;->g:Ljava/lang/Object;

    iput-object p5, p0, La/wuh;->d:La/fhj;

    iput-object p6, p0, La/wuh;->c:Ljava/lang/String;

    iput-object p7, p0, La/wuh;->f:La/wyu;

    iput-object p8, p0, La/wuh;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/qzt;La/weu;Ljava/lang/String;La/fhj;JLa/wyu;La/vzg0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/wuh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wuh;->b:La/qzt;

    iput-object p2, p0, La/wuh;->g:Ljava/lang/Object;

    iput-object p3, p0, La/wuh;->c:Ljava/lang/String;

    iput-object p4, p0, La/wuh;->d:La/fhj;

    iput-wide p5, p0, La/wuh;->e:J

    iput-object p7, p0, La/wuh;->f:La/wyu;

    iput-object p8, p0, La/wuh;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wuh;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/wuh;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/wuh;->f:La/wyu;

    .line 8
    .line 9
    iget-object v4, v0, La/wuh;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/wuh;->b:La/qzt;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v4, La/weu;

    .line 17
    .line 18
    check-cast v2, La/vzg0;

    .line 19
    .line 20
    invoke-virtual {v5}, La/qzt;->a()La/eme;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    iget-object v9, v0, La/wuh;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v4, v9}, La/weu;->a(Ljava/lang/String;)La/hdm0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v3}, La/wyu;->a()La/uaq0;

    .line 31
    .line 32
    .line 33
    move-result-object v12

    .line 34
    const-wide/16 v13, 0x0

    .line 35
    .line 36
    iget-object v8, v0, La/wuh;->d:La/fhj;

    .line 37
    .line 38
    iget-wide v10, v0, La/wuh;->e:J

    .line 39
    .line 40
    invoke-virtual/range {v8 .. v14}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    const-string v0, "KEY_SELECTED_TAB"

    .line 45
    .line 46
    invoke-virtual {v2, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/Integer;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    :goto_0
    move v12, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    const/4 v0, 0x0

    .line 61
    goto :goto_0

    .line 62
    :goto_1
    sget-object v11, La/iun;->a:La/iun;

    .line 63
    .line 64
    new-instance v6, La/pma0;

    .line 65
    .line 66
    const/4 v14, 0x1

    .line 67
    const/4 v15, 0x0

    .line 68
    const/4 v10, 0x0

    .line 69
    const/4 v13, 0x1

    .line 70
    move-object v8, v1

    .line 71
    invoke-direct/range {v6 .. v15}, La/pma0;-><init>(La/eme;La/hdm0;La/nc5;La/fja0;Ljava/util/List;IZZZ)V

    .line 72
    .line 73
    .line 74
    return-object v6

    .line 75
    :pswitch_0
    check-cast v4, La/ctf0;

    .line 76
    .line 77
    check-cast v2, La/pru;

    .line 78
    .line 79
    new-instance v6, La/ruh;

    .line 80
    .line 81
    new-instance v1, La/edm0;

    .line 82
    .line 83
    const-wide/16 v7, 0x0

    .line 84
    .line 85
    invoke-direct {v1, v7, v8}, La/edm0;-><init>(J)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, La/qzt;->a()La/eme;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-static {v1, v5, v4}, La/aem0;->x(La/hdm0;La/eme;La/ctf0;)La/zdm0;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-virtual {v3}, La/wyu;->a()La/uaq0;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    const-wide/16 v15, 0x0

    .line 101
    .line 102
    iget-object v10, v0, La/wuh;->d:La/fhj;

    .line 103
    .line 104
    iget-object v11, v0, La/wuh;->c:Ljava/lang/String;

    .line 105
    .line 106
    iget-wide v7, v0, La/wuh;->e:J

    .line 107
    .line 108
    move-wide v12, v7

    .line 109
    invoke-virtual/range {v10 .. v16}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    move-object/from16 v16, v11

    .line 114
    .line 115
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 120
    .line 121
    iget-object v14, v0, La/mum0;->t:La/llm0;

    .line 122
    .line 123
    const-string v19, ""

    .line 124
    .line 125
    sget-object v20, La/iun;->a:La/iun;

    .line 126
    .line 127
    const/4 v11, 0x1

    .line 128
    const/4 v12, 0x0

    .line 129
    const/4 v13, 0x0

    .line 130
    const-string v15, ""

    .line 131
    .line 132
    const-string v17, ""

    .line 133
    .line 134
    const-string v18, ""

    .line 135
    .line 136
    invoke-direct/range {v6 .. v20}, La/ruh;-><init>(JLa/zdm0;La/nc5;ZZZLa/llm0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    return-object v6

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
