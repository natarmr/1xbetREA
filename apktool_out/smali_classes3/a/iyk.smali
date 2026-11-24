.class public final La/iyk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    if-ge p1, v1, :cond_0

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/high16 v1, 0x40000000    # 2.0f

    .line 13
    .line 14
    if-ge p1, v1, :cond_1

    .line 15
    .line 16
    int-to-float p1, p1

    .line 17
    const/high16 v1, 0x3f400000    # 0.75f

    .line 18
    .line 19
    div-float/2addr p1, v1

    .line 20
    const/high16 v1, 0x3f800000    # 1.0f

    .line 21
    .line 22
    add-float/2addr p1, v1

    .line 23
    float-to-int p1, p1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const p1, 0x7fffffff

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/iyk;->a:Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object p0, p0, La/iyk;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public b(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/iyk;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
