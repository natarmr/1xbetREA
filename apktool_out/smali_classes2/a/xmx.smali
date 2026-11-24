.class public final La/xmx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/iys0;
.implements La/jys0;


# instance fields
.field public a:La/wsy;

.field public final b:Ljava/util/LinkedHashSet;

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/util/AbstractCollection;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/xmx;->b:Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, La/xmx;->c:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()La/kzj0;
    .locals 7

    .line 1
    sget-object v0, La/ays0;->b:La/fck0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, La/ays0;->c:La/ays0;

    .line 7
    .line 8
    sget-object v3, La/iun;->a:La/iun;

    .line 9
    .line 10
    const-string v0, "member scope for intersection type"

    .line 11
    .line 12
    iget-object v2, p0, La/xmx;->b:Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-static {v0, v2}, La/jpm0;->j(Ljava/lang/String;Ljava/util/Collection;)La/cr30;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    new-instance v6, La/w0;

    .line 19
    .line 20
    const/16 v0, 0x19

    .line 21
    .line 22
    invoke-direct {v6, p0, v0}, La/w0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    move-object v2, p0

    .line 27
    invoke-static/range {v1 .. v6}, La/ucx;->i0(La/ays0;La/iys0;Ljava/util/List;ZLa/cr30;Lkotlin/jvm/functions/Function1;)La/kzj0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final b()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, La/xmx;->b:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/ary;
    .locals 0

    .line 1
    iget-object p0, p0, La/xmx;->b:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/wsy;

    .line 12
    .line 13
    invoke-virtual {p0}, La/wsy;->S()La/iys0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, La/iys0;->c()La/ary;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final d(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/mto;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, p1, v1}, La/mto;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/xmx;->b:Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v5, La/w8v;

    .line 17
    .line 18
    const/4 p0, 0x4

    .line 19
    invoke-direct {v5, p1, p0}, La/w8v;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 20
    .line 21
    .line 22
    const/16 v6, 0x18

    .line 23
    .line 24
    const-string v2, " & "

    .line 25
    .line 26
    const-string v3, "{"

    .line 27
    .line 28
    const-string v4, "}"

    .line 29
    .line 30
    invoke-static/range {v1 .. v6}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, La/xmx;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, La/xmx;

    .line 12
    .line 13
    iget-object p1, p1, La/xmx;->b:Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    iget-object p0, p0, La/xmx;->b:Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget p0, p0, La/xmx;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()La/foc;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final p()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, La/j9x;->d:La/j9x;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/xmx;->d(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
