.class public final La/by40;
.super La/wbf;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 15
    sget-object p1, La/vbf;->b:La/vbf;

    invoke-direct {p0, p1}, La/by40;-><init>(La/wbf;)V

    return-void
.end method

.method public constructor <init>(La/wbf;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, La/wbf;->a:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {p0}, La/wbf;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/wbf;->a:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
