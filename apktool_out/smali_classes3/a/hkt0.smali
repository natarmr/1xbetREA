.class public final La/hkt0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;


# direct methods
.method public constructor <init>(La/pbt;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/hkt0;->a:La/pbt;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(La/vpv0;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/hkt0;->a:La/pbt;

    .line 2
    .line 3
    iget-object v0, p0, La/pbt;->a:La/j5t;

    .line 4
    .line 5
    iget-object v0, v0, La/j5t;->m:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Long;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    new-instance v2, La/no60;

    .line 20
    .line 21
    invoke-direct {v2, v0, v1, p1}, La/no60;-><init>(JLa/vpv0;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/pbt;->c:La/g7d;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, La/g7d;->f(Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method
