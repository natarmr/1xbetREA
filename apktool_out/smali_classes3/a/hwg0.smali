.class public final synthetic La/hwg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:D

.field public final synthetic c:D

.field public final synthetic d:La/ytg0;


# direct methods
.method public synthetic constructor <init>(FDDLa/ytg0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/hwg0;->a:F

    iput-wide p2, p0, La/hwg0;->b:D

    iput-wide p4, p0, La/hwg0;->c:D

    iput-object p6, p0, La/hwg0;->d:La/ytg0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/oyg0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, La/svg0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v5, v0, La/hwg0;->a:F

    .line 18
    .line 19
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "KEY_AUTO_SALE_PROGRESS"

    .line 24
    .line 25
    invoke-static {v1, v3, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-wide v12, v0, La/hwg0;->b:D

    .line 29
    .line 30
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v4, "KEY_PAYMENT_VALUE"

    .line 35
    .line 36
    invoke-static {v1, v3, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-wide v14, v0, La/hwg0;->c:D

    .line 40
    .line 41
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-string v4, "KEY_AUTO_SALE_VALUE"

    .line 46
    .line 47
    invoke-static {v1, v3, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/16 v27, 0x0

    .line 51
    .line 52
    const v28, 0x7eff3b

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    const-wide/16 v6, 0x0

    .line 58
    .line 59
    const-wide/16 v8, 0x0

    .line 60
    .line 61
    const-wide/16 v10, 0x0

    .line 62
    .line 63
    const-wide/16 v16, 0x0

    .line 64
    .line 65
    const-wide/16 v18, 0x0

    .line 66
    .line 67
    const/16 v20, 0x0

    .line 68
    .line 69
    const/16 v21, 0x0

    .line 70
    .line 71
    const/16 v22, 0x0

    .line 72
    .line 73
    const/16 v23, 0x0

    .line 74
    .line 75
    iget-object v0, v0, La/hwg0;->d:La/ytg0;

    .line 76
    .line 77
    const/16 v25, 0x0

    .line 78
    .line 79
    const/16 v26, 0x0

    .line 80
    .line 81
    move-object/from16 v24, v0

    .line 82
    .line 83
    invoke-static/range {v2 .. v28}, La/svg0;->a(La/svg0;FFFDDDDDDDZZLa/xtg0;La/wvg0;La/ytg0;La/ql5;Ljava/util/List;Ljava/util/List;I)La/svg0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0
.end method
