.class public final synthetic La/elw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:I

.field public final synthetic c:La/pu90;

.field public final synthetic d:I

.field public final synthetic e:La/pu90;

.field public final synthetic f:La/pu90;


# direct methods
.method public synthetic constructor <init>(JILa/pu90;ILa/pu90;La/pu90;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/elw;->a:J

    iput p3, p0, La/elw;->b:I

    iput-object p4, p0, La/elw;->c:La/pu90;

    iput p5, p0, La/elw;->d:I

    iput-object p6, p0, La/elw;->e:La/pu90;

    iput-object p7, p0, La/elw;->f:La/pu90;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, La/ou90;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, La/elw;->a:J

    .line 7
    .line 8
    invoke-static {v0, v1}, La/p4e;->h(J)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    div-int/lit8 v0, v0, 0x2

    .line 13
    .line 14
    iget v1, p0, La/elw;->b:I

    .line 15
    .line 16
    div-int/lit8 v2, v1, 0x2

    .line 17
    .line 18
    sub-int/2addr v0, v2

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    iget-object v4, p0, La/elw;->c:La/pu90;

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v4, v3, v0, v2}, La/ou90;->m(La/pu90;IIF)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget v4, p0, La/elw;->d:I

    .line 29
    .line 30
    sub-int v4, v0, v4

    .line 31
    .line 32
    iget-object v5, p0, La/elw;->e:La/pu90;

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1, v5, v3, v4, v2}, La/ou90;->m(La/pu90;IIF)V

    .line 37
    .line 38
    .line 39
    :cond_1
    add-int/2addr v0, v1

    .line 40
    iget-object p0, p0, La/elw;->f:La/pu90;

    .line 41
    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1, p0, v3, v0, v2}, La/ou90;->m(La/pu90;IIF)V

    .line 45
    .line 46
    .line 47
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0
.end method
