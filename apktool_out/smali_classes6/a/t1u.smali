.class public final La/t1u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/gxu;


# direct methods
.method public synthetic constructor <init>(La/gxu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/t1u;->a:La/gxu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)La/kjo0;
    .locals 1

    .line 1
    iget-object p0, p0, La/t1u;->a:La/gxu;

    .line 2
    .line 3
    iget-object p0, p0, La/gxu;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/eia0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/eia0;->c:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/kjo0;

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    sget-object p0, La/kjo0;->f:La/kjo0;

    .line 33
    .line 34
    :cond_0
    return-object p0
.end method

.method public b(ILjava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object p0, p0, La/t1u;->a:La/gxu;

    .line 2
    .line 3
    iget-object p0, p0, La/gxu;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/eia0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/eia0;->e:La/rha0;

    .line 11
    .line 12
    iget-object p0, p0, La/rha0;->d:Ljava/util/Map;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/util/List;

    .line 31
    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    sget-object p0, La/iun;->a:La/iun;

    .line 35
    .line 36
    :cond_0
    return-object p0
.end method
