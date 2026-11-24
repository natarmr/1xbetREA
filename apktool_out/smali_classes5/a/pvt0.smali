.class public final La/pvt0;
.super La/vvt0;
.source "SourceFile"


# instance fields
.field public final synthetic d:La/rvt0;


# direct methods
.method public constructor <init>(La/rvt0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pvt0;->d:La/rvt0;

    .line 2
    .line 3
    const-string p1, "users.get"

    .line 4
    .line 5
    invoke-direct {p0, p1}, La/vvt0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/pvt0;->d:La/rvt0;

    .line 5
    .line 6
    iget-object p0, p0, La/rvt0;->e2:La/vby;

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v0, La/dwt0;->Companion:La/cwt0;

    .line 18
    .line 19
    invoke-virtual {v0}, La/cwt0;->serializer()La/jiy;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/jiy;

    .line 24
    .line 25
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, La/dwt0;

    .line 30
    .line 31
    iget-object p0, p0, La/dwt0;->a:Ljava/util/List;

    .line 32
    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    sget-object p0, La/iun;->a:La/iun;

    .line 36
    .line 37
    :cond_0
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, La/awt0;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    const-string p0, "json"

    .line 45
    .line 46
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    throw p0
.end method
