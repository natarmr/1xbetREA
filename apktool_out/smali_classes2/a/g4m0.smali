.class public abstract La/g4m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/kiy;

.field public static final b:La/kiy;

.field public static final c:La/kiy;

.field public static final d:La/kiy;

.field public static final e:La/iyj0;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, La/sre0;->a(Ljava/lang/Class;)La/kiy;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, La/g4m0;->a:La/kiy;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v0, v2, v3}, La/tre0;->k(La/sgy;Ljava/util/List;Z)La/kiy;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, La/g4m0;->b:La/kiy;

    .line 23
    .line 24
    const-class v0, Ljava/lang/Cloneable;

    .line 25
    .line 26
    invoke-static {v0}, La/sre0;->a(Ljava/lang/Class;)La/kiy;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, La/g4m0;->c:La/kiy;

    .line 31
    .line 32
    const-class v0, Ljava/io/Serializable;

    .line 33
    .line 34
    invoke-static {v0}, La/sre0;->a(Ljava/lang/Class;)La/kiy;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, La/g4m0;->d:La/kiy;

    .line 39
    .line 40
    new-instance v2, La/iyj0;

    .line 41
    .line 42
    const-class v0, Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    sget-object v4, La/iun;->a:La/iun;

    .line 49
    .line 50
    new-instance v6, La/obx;

    .line 51
    .line 52
    invoke-direct {v6, v4}, La/obx;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/4 v11, 0x0

    .line 56
    sget-object v12, La/pul;->q:La/pul;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x0

    .line 61
    const/4 v9, 0x0

    .line 62
    const/4 v10, 0x0

    .line 63
    invoke-direct/range {v2 .. v12}, La/iyj0;-><init>(La/fhy;Ljava/util/List;ZLa/a8z;La/kiy;ZZZLa/sgy;Lkotlin/jvm/functions/Function0;)V

    .line 64
    .line 65
    .line 66
    sput-object v2, La/g4m0;->e:La/iyj0;

    .line 67
    .line 68
    return-void
.end method
