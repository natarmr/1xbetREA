.class public final La/jau;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public synthetic i:I

.field public synthetic j:J

.field public synthetic k:Z

.field public final synthetic l:La/pwi;

.field public final synthetic m:La/sff0;

.field public final synthetic n:La/c5q;

.field public final synthetic o:Z

.field public final synthetic p:Z


# direct methods
.method public constructor <init>(La/pwi;La/sff0;La/c5q;ZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jau;->l:La/pwi;

    .line 2
    .line 3
    iput-object p2, p0, La/jau;->m:La/sff0;

    .line 4
    .line 5
    iput-object p3, p0, La/jau;->n:La/c5q;

    .line 6
    .line 7
    iput-boolean p4, p0, La/jau;->o:Z

    .line 8
    .line 9
    iput-boolean p5, p0, La/jau;->p:Z

    .line 10
    .line 11
    const/4 p1, 0x4

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v7, p0, La/jau;->i:I

    .line 2
    .line 3
    iget-wide v4, p0, La/jau;->j:J

    .line 4
    .line 5
    iget-boolean v3, p0, La/jau;->k:Z

    .line 6
    .line 7
    sget-object v0, La/wne;->a:La/wne;

    .line 8
    .line 9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, La/iz30;->k:La/iz30;

    .line 13
    .line 14
    iget-object v0, p0, La/jau;->m:La/sff0;

    .line 15
    .line 16
    iget-object v0, v0, La/sff0;->a:La/gx7;

    .line 17
    .line 18
    iget-object v0, v0, La/gx7;->f:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v1, Lkotlin/Pair;

    .line 21
    .line 22
    invoke-direct {v1, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v0, La/sc80;

    .line 33
    .line 34
    iget-boolean v1, p0, La/jau;->p:Z

    .line 35
    .line 36
    iget-boolean v2, p0, La/jau;->o:Z

    .line 37
    .line 38
    invoke-direct/range {v0 .. v7}, La/sc80;-><init>(ZZZJLjava/util/Map;I)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, La/jau;->n:La/c5q;

    .line 42
    .line 43
    invoke-static {p0, v0}, La/pgi0;->q(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, La/pgi0;->t(Lkotlin/sequences/Sequence;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    check-cast p3, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    move-object v8, p4

    .line 20
    check-cast v8, La/yje;

    .line 21
    .line 22
    new-instance v2, La/jau;

    .line 23
    .line 24
    iget-boolean v6, p0, La/jau;->o:Z

    .line 25
    .line 26
    iget-boolean v7, p0, La/jau;->p:Z

    .line 27
    .line 28
    iget-object v3, p0, La/jau;->l:La/pwi;

    .line 29
    .line 30
    iget-object v4, p0, La/jau;->m:La/sff0;

    .line 31
    .line 32
    iget-object v5, p0, La/jau;->n:La/c5q;

    .line 33
    .line 34
    invoke-direct/range {v2 .. v8}, La/jau;-><init>(La/pwi;La/sff0;La/c5q;ZZLa/yje;)V

    .line 35
    .line 36
    .line 37
    iput p1, v2, La/jau;->i:I

    .line 38
    .line 39
    iput-wide v0, v2, La/jau;->j:J

    .line 40
    .line 41
    iput-boolean p2, v2, La/jau;->k:Z

    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    invoke-virtual {v2, p0}, La/jau;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
