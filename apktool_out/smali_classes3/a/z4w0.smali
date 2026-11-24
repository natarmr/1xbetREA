.class public final La/z4w0;
.super Ljava/lang/Object;


# instance fields
.field public final a:La/j6w0;


# direct methods
.method public constructor <init>(La/j6w0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z4w0;->a:La/j6w0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/iqt0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/iqt0;->b:La/i7a;

    .line 5
    .line 6
    iget-object v0, v0, La/i7a;->d:La/m7a;

    .line 7
    .line 8
    iget-object p0, p0, La/z4w0;->a:La/j6w0;

    .line 9
    .line 10
    iget-object p0, p0, La/j6w0;->a:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, La/mz40;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    sget-object v1, La/i99;->b:La/i99;

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    const/4 v3, 0x1

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-static {v3, v4, v1, v2}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-interface {v1, p1}, La/mz40;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method
