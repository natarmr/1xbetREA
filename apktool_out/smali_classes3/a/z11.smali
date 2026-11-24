.class public final synthetic La/z11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/z11;->a:I

    iput p2, p0, La/z11;->b:I

    iput p3, p0, La/z11;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

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
    check-cast v2, La/q11;

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
    new-instance v1, La/e7v;

    .line 18
    .line 19
    new-instance v3, La/y6v;

    .line 20
    .line 21
    sget-object v4, La/d7v;->b:La/d7v;

    .line 22
    .line 23
    iget v5, v0, La/z11;->a:I

    .line 24
    .line 25
    invoke-direct {v3, v4, v5}, La/y6v;-><init>(La/d7v;I)V

    .line 26
    .line 27
    .line 28
    new-instance v4, La/y6v;

    .line 29
    .line 30
    sget-object v5, La/d7v;->c:La/d7v;

    .line 31
    .line 32
    iget v6, v0, La/z11;->b:I

    .line 33
    .line 34
    invoke-direct {v4, v5, v6}, La/y6v;-><init>(La/d7v;I)V

    .line 35
    .line 36
    .line 37
    new-instance v5, La/y6v;

    .line 38
    .line 39
    sget-object v6, La/d7v;->d:La/d7v;

    .line 40
    .line 41
    iget v0, v0, La/z11;->c:I

    .line 42
    .line 43
    invoke-direct {v5, v6, v0}, La/y6v;-><init>(La/d7v;I)V

    .line 44
    .line 45
    .line 46
    filled-new-array {v3, v4, v5}, [La/y6v;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {v1, v0}, La/e7v;-><init>(La/i4;)V

    .line 55
    .line 56
    .line 57
    const/16 v20, 0x0

    .line 58
    .line 59
    const v21, 0x1ffdffff

    .line 60
    .line 61
    .line 62
    const-wide/16 v3, 0x0

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v6, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x0

    .line 71
    const/4 v12, 0x0

    .line 72
    const/4 v13, 0x0

    .line 73
    const/4 v14, 0x0

    .line 74
    const/4 v15, 0x0

    .line 75
    const/16 v17, 0x0

    .line 76
    .line 77
    const/16 v18, 0x0

    .line 78
    .line 79
    const/16 v19, 0x0

    .line 80
    .line 81
    move-object/from16 v16, v1

    .line 82
    .line 83
    invoke-static/range {v2 .. v21}, La/q11;->a(La/q11;JLa/d7v;Ljava/lang/Integer;La/b7v;La/m7v;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/LinkedHashMap;ZZZLa/g7v;ZLa/ql5;Ljava/util/ArrayList;Ljava/util/Set;I)La/q11;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0
.end method
