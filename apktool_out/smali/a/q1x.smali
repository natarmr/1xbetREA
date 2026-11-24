.class public abstract La/q1x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/kuo;

.field public static final b:La/kuo;

.field public static final c:La/kuo;

.field public static final d:La/kuo;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/kuo;

    .line 2
    .line 3
    sget-object v1, La/iun;->a:La/iun;

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/kuo;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/q1x;->a:La/kuo;

    .line 9
    .line 10
    new-instance v0, La/kuo;

    .line 11
    .line 12
    const/16 v1, 0x1000

    .line 13
    .line 14
    invoke-static {v1, v1}, La/q7x;->r(II)La/f7k0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, La/kuo;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, La/q1x;->b:La/kuo;

    .line 22
    .line 23
    new-instance v0, La/kuo;

    .line 24
    .line 25
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-direct {v0, v1}, La/kuo;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, La/q1x;->c:La/kuo;

    .line 31
    .line 32
    new-instance v0, La/kuo;

    .line 33
    .line 34
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/kuo;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/q1x;->d:La/kuo;

    .line 40
    .line 41
    return-void
.end method

.method public static final a(La/k1x;)V
    .locals 2

    .line 1
    sget-object v0, La/t1x;->a:La/kuo;

    .line 2
    .line 3
    new-instance v0, La/mef;

    .line 4
    .line 5
    const/16 v1, 0xc8

    .line 6
    .line 7
    invoke-direct {v0, v1}, La/mef;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/k1x;->b()La/juo;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v1, La/t1x;->a:La/kuo;

    .line 15
    .line 16
    invoke-virtual {p0, v1, v0}, La/juo;->a(La/kuo;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final b(La/k1x;Ljava/util/List;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/k1x;->b()La/juo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/q1x;->a:La/kuo;

    .line 6
    .line 7
    invoke-static {p1}, La/aac;->e0(Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v1, v2}, La/juo;->a(La/kuo;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, La/kie0;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v5, La/adw;

    .line 20
    .line 21
    const/16 v1, 0x9

    .line 22
    .line 23
    invoke-direct {v5, v0, v1}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    const/16 v6, 0x1f

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    move-object v1, p1

    .line 32
    invoke-static/range {v1 .. v6}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p0, La/k1x;->h:Ljava/util/Map;

    .line 37
    .line 38
    iget-boolean v1, p0, La/k1x;->g:Z

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    instance-of v1, v0, Ljava/util/Map;

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    check-cast v0, Ljava/util/Map;

    .line 56
    .line 57
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, La/k1x;->h:Ljava/util/Map;

    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p0, La/k1x;->g:Z

    .line 66
    .line 67
    move-object v0, v1

    .line 68
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, La/zys0;->c(Ljava/lang/Object;)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string v0, "coil#transformations"

    .line 76
    .line 77
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    .line 82
    .line 83
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 84
    .line 85
    .line 86
    throw p0
.end method
