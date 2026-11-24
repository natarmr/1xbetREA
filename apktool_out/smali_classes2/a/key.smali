.class public final La/key;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/mey;


# direct methods
.method public synthetic constructor <init>(La/mey;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/key;->a:B

    iput-object p1, p0, La/key;->b:La/mey;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/key;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/key;->b:La/mey;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/mey;->a:La/ym40;

    .line 9
    .line 10
    invoke-interface {p0}, La/ym40;->c()La/ary;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, La/ary;->e()La/kzj0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object p0, p0, La/mey;->a:La/ym40;

    .line 20
    .line 21
    invoke-interface {p0}, La/ym40;->c()La/ary;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v0, ""

    .line 26
    .line 27
    const-string v1, "WARNING"

    .line 28
    .line 29
    const-string v2, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version"

    .line 30
    .line 31
    invoke-static {p0, v2, v0, v1}, La/d93;->a(La/ary;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/tc9;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    sget-object p0, La/ujn;->c:La/f93;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance v0, La/i93;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-direct {v0, p0, v1}, La/i93;-><init>(Ljava/util/List;B)V

    .line 55
    .line 56
    .line 57
    move-object p0, v0

    .line 58
    :goto_0
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
