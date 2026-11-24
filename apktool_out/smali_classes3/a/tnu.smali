.class public final La/tnu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/util/List;

.field public synthetic k:La/sw00;

.field public final synthetic l:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tnu;->i:B

    iput-object p1, p0, La/tnu;->l:Ljava/util/List;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tnu;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/tnu;->l:Ljava/util/List;

    .line 4
    .line 5
    check-cast p1, Ljava/util/List;

    .line 6
    .line 7
    check-cast p2, La/sw00;

    .line 8
    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, La/tnu;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, p0, p3, v1}, La/tnu;-><init>(Ljava/util/List;La/yje;B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/tnu;->j:Ljava/util/List;

    .line 21
    .line 22
    iput-object p2, v0, La/tnu;->k:La/sw00;

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, La/tnu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance v0, La/tnu;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p0, p3, v1}, La/tnu;-><init>(Ljava/util/List;La/yje;B)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, La/tnu;->j:Ljava/util/List;

    .line 38
    .line 39
    iput-object p2, v0, La/tnu;->k:La/sw00;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, La/tnu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tnu;->i:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    iget-object v3, v0, La/tnu;->l:Ljava/util/List;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v10, v0, La/tnu;->j:Ljava/util/List;

    .line 13
    .line 14
    iget-object v0, v0, La/tnu;->k:La/sw00;

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, La/gza0;

    .line 45
    .line 46
    iget-wide v5, v3, La/gza0;->a:J

    .line 47
    .line 48
    iget-object v7, v3, La/gza0;->b:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v8, v3, La/gza0;->c:Ljava/util/List;

    .line 51
    .line 52
    iget-boolean v11, v0, La/sw00;->a:Z

    .line 53
    .line 54
    sget-object v9, La/fza0;->c:La/fza0;

    .line 55
    .line 56
    new-instance v4, La/gza0;

    .line 57
    .line 58
    invoke-direct/range {v4 .. v11}, La/gza0;-><init>(JLjava/lang/String;Ljava/util/List;La/fza0;Ljava/util/List;Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    return-object v1

    .line 66
    :pswitch_0
    iget-object v1, v0, La/tnu;->j:Ljava/util/List;

    .line 67
    .line 68
    iget-object v0, v0, La/tnu;->k:La/sw00;

    .line 69
    .line 70
    sget-object v4, La/wne;->a:La/wne;

    .line 71
    .line 72
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_1

    .line 93
    .line 94
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, La/gza0;

    .line 99
    .line 100
    iget-wide v12, v3, La/gza0;->a:J

    .line 101
    .line 102
    iget-object v15, v3, La/gza0;->c:Ljava/util/List;

    .line 103
    .line 104
    iget-boolean v5, v0, La/sw00;->a:Z

    .line 105
    .line 106
    iget-object v3, v3, La/gza0;->d:La/fza0;

    .line 107
    .line 108
    new-instance v11, La/gza0;

    .line 109
    .line 110
    const-string v14, ""

    .line 111
    .line 112
    move-object/from16 v17, v1

    .line 113
    .line 114
    move-object/from16 v16, v3

    .line 115
    .line 116
    move/from16 v18, v5

    .line 117
    .line 118
    invoke-direct/range {v11 .. v18}, La/gza0;-><init>(JLjava/lang/String;Ljava/util/List;La/fza0;Ljava/util/List;Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_1
    return-object v4

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
