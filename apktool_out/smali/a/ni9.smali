.class public final La/ni9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g45;


# direct methods
.method public synthetic constructor <init>(La/g45;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ni9;->a:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)La/g0f;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/ni9;->a:La/g45;

    .line 4
    .line 5
    iget-object v0, v0, La/g45;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/m0f;

    .line 8
    .line 9
    iget-object v0, v0, La/m0f;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v2, v1

    .line 26
    check-cast v2, La/g0f;

    .line 27
    .line 28
    iget-object v2, v2, La/g0f;->b:Ljava/util/List;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, La/hf6;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    iget v2, v2, La/hf6;->a:I

    .line 40
    .line 41
    move/from16 v3, p1

    .line 42
    .line 43
    if-ne v2, v3, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move/from16 v3, p1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v1, 0x0

    .line 50
    :goto_1
    check-cast v1, La/g0f;

    .line 51
    .line 52
    if-nez v1, :cond_3

    .line 53
    .line 54
    new-instance v2, La/g0f;

    .line 55
    .line 56
    sget-object v5, La/iun;->a:La/iun;

    .line 57
    .line 58
    const-wide/16 v29, 0x0

    .line 59
    .line 60
    const/16 v31, 0x0

    .line 61
    .line 62
    const-wide/16 v3, 0x0

    .line 63
    .line 64
    const-wide/16 v6, 0x0

    .line 65
    .line 66
    const-wide/16 v9, 0x0

    .line 67
    .line 68
    const-wide/16 v11, 0x0

    .line 69
    .line 70
    const-wide/16 v13, 0x0

    .line 71
    .line 72
    const-wide/16 v15, 0x0

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    .line 76
    const-wide/16 v18, 0x0

    .line 77
    .line 78
    const/16 v20, 0x0

    .line 79
    .line 80
    const/16 v21, 0x0

    .line 81
    .line 82
    const-string v22, ""

    .line 83
    .line 84
    const/16 v23, 0x0

    .line 85
    .line 86
    const/16 v24, 0x0

    .line 87
    .line 88
    const-string v25, ""

    .line 89
    .line 90
    const-wide/16 v27, 0x0

    .line 91
    .line 92
    move-object v8, v5

    .line 93
    move-object/from16 v26, v5

    .line 94
    .line 95
    invoke-direct/range {v2 .. v31}, La/g0f;-><init>(JLjava/util/List;DLjava/util/List;DJDDZDZILjava/lang/String;ZILjava/lang/String;Ljava/util/List;DDZ)V

    .line 96
    .line 97
    .line 98
    return-object v2

    .line 99
    :cond_3
    return-object v1
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object p0, p0, La/ni9;->a:La/g45;

    .line 2
    .line 3
    iget-object p0, p0, La/g45;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/q7d0;

    .line 6
    .line 7
    const-string v0, "COUPON_KEY_PREFERENCE"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, La/q7d0;->h(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "COUPON_TYPE_KEY_PREFERENCE"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/q7d0;->h(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public c()Z
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p0, p0, La/ni9;->a:La/g45;

    .line 6
    .line 7
    iget-object p0, p0, La/g45;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/ave;

    .line 10
    .line 11
    iget-wide v2, p0, La/ave;->b:J

    .line 12
    .line 13
    sub-long/2addr v0, v2

    .line 14
    const-wide/32 v2, 0x1d4c0

    .line 15
    .line 16
    .line 17
    cmp-long p0, v0, v2

    .line 18
    .line 19
    if-gez p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method
