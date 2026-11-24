.class public final La/a17;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r7v;

.field public final b:La/knf0;

.field public final c:La/kuy;

.field public final d:La/mne;

.field public final e:La/x07;


# direct methods
.method public constructor <init>(La/r7v;La/knf0;La/kuy;La/mne;La/x07;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/a17;->a:La/r7v;

    .line 14
    .line 15
    iput-object p2, p0, La/a17;->b:La/knf0;

    .line 16
    .line 17
    iput-object p3, p0, La/a17;->c:La/kuy;

    .line 18
    .line 19
    iput-object p4, p0, La/a17;->d:La/mne;

    .line 20
    .line 21
    iput-object p5, p0, La/a17;->e:La/x07;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(JZLjava/util/List;Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v1, v0, La/y07;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/y07;

    .line 9
    .line 10
    iget v2, v1, La/y07;->k:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/y07;->k:I

    .line 20
    .line 21
    :goto_0
    move-object v8, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, La/y07;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, La/y07;-><init>(La/a17;La/zje;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v8, La/y07;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v9, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v1, v8, La/y07;->k:I

    .line 34
    .line 35
    const/4 v10, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v10, :cond_1

    .line 39
    .line 40
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    return-object v0

    .line 51
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, La/a17;->d:La/mne;

    .line 55
    .line 56
    iget-object v11, v0, La/mne;->b:La/dvj;

    .line 57
    .line 58
    new-instance v0, La/z07;

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    move-object v5, p0

    .line 62
    move-wide v2, p1

    .line 63
    move v4, p3

    .line 64
    move-object/from16 v1, p4

    .line 65
    .line 66
    move-object/from16 v6, p5

    .line 67
    .line 68
    invoke-direct/range {v0 .. v7}, La/z07;-><init>(Ljava/util/List;JZLa/a17;Ljava/util/List;La/yje;)V

    .line 69
    .line 70
    .line 71
    iput v10, v8, La/y07;->k:I

    .line 72
    .line 73
    invoke-static {v11, v0, v8}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-ne v0, v9, :cond_3

    .line 78
    .line 79
    return-object v9

    .line 80
    :cond_3
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object v0
.end method
