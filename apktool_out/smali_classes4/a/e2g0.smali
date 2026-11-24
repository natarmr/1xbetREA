.class public final synthetic La/e2g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g2g0;

.field public final synthetic c:La/l2g0;


# direct methods
.method public synthetic constructor <init>(La/g2g0;La/l2g0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e2g0;->a:B

    iput-object p1, p0, La/e2g0;->b:La/g2g0;

    iput-object p2, p0, La/e2g0;->c:La/l2g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e2g0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/e2g0;->c:La/l2g0;

    .line 6
    .line 7
    iget-object v0, v0, La/e2g0;->b:La/g2g0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/k0w0;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, La/g2g0;->m:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La/gr00;

    .line 22
    .line 23
    new-instance v3, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 24
    .line 25
    iget-object v4, v2, La/l2g0;->e:Ljava/lang/String;

    .line 26
    .line 27
    iget-wide v5, v2, La/l2g0;->d:J

    .line 28
    .line 29
    iget v8, v2, La/l2g0;->w:I

    .line 30
    .line 31
    iget-object v9, v2, La/l2g0;->l:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v10, v2, La/l2g0;->m:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v7, v2, La/l2g0;->n:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    check-cast v7, Ljava/lang/String;

    .line 42
    .line 43
    const-string v11, ""

    .line 44
    .line 45
    if-nez v7, :cond_0

    .line 46
    .line 47
    move-object v7, v11

    .line 48
    :cond_0
    iget-object v12, v2, La/l2g0;->o:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v12

    .line 54
    check-cast v12, Ljava/lang/String;

    .line 55
    .line 56
    if-nez v12, :cond_1

    .line 57
    .line 58
    move-object v12, v11

    .line 59
    :cond_1
    iget-wide v13, v2, La/l2g0;->s:J

    .line 60
    .line 61
    iget-object v15, v2, La/l2g0;->p:Ljava/lang/String;

    .line 62
    .line 63
    move-object v11, v7

    .line 64
    const/4 v7, 0x0

    .line 65
    invoke-direct/range {v3 .. v15}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v2, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 72
    .line 73
    invoke-direct {v2, v3, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 77
    .line 78
    .line 79
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_0
    move-object/from16 v1, p1

    .line 83
    .line 84
    check-cast v1, La/k0w0;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object v0, v0, La/g2g0;->o:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, La/kys0;

    .line 92
    .line 93
    iget-object v8, v2, La/l2g0;->e:Ljava/lang/String;

    .line 94
    .line 95
    iget-wide v4, v2, La/l2g0;->a:J

    .line 96
    .line 97
    iget-wide v6, v2, La/l2g0;->c:J

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v3, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;

    .line 103
    .line 104
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;-><init>(JJLjava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 108
    .line 109
    .line 110
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
