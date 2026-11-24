.class public final La/mrc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/gxu;


# direct methods
.method public synthetic constructor <init>(La/gxu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mrc;->a:La/gxu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/mrc;->a:La/gxu;

    .line 5
    .line 6
    iget-object p0, p0, La/gxu;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/eia0;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/eia0;->b:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Integer;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/mrc;->a:La/gxu;

    .line 2
    .line 3
    iget-object p0, p0, La/gxu;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/eia0;

    .line 6
    .line 7
    iget-object p0, p0, La/eia0;->f:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method
