.class public final La/pzj;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:La/rzj;

.field public final synthetic j:Ljava/util/ArrayList;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public constructor <init>(La/rzj;La/yje;Ljava/util/ArrayList;III)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pzj;->i:La/rzj;

    .line 2
    .line 3
    iput-object p3, p0, La/pzj;->j:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput p4, p0, La/pzj;->k:I

    .line 6
    .line 7
    iput p5, p0, La/pzj;->l:I

    .line 8
    .line 9
    iput p6, p0, La/pzj;->m:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/pzj;

    .line 2
    .line 3
    iget v5, p0, La/pzj;->l:I

    .line 4
    .line 5
    iget v6, p0, La/pzj;->m:I

    .line 6
    .line 7
    iget-object v1, p0, La/pzj;->i:La/rzj;

    .line 8
    .line 9
    iget-object v3, p0, La/pzj;->j:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget v4, p0, La/pzj;->k:I

    .line 12
    .line 13
    move-object v2, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/pzj;-><init>(La/rzj;La/yje;Ljava/util/ArrayList;III)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/pzj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/pzj;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/pzj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/pzj;->i:La/rzj;

    .line 7
    .line 8
    invoke-virtual {p1}, La/rzj;->n()La/xot0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget v0, p0, La/pzj;->l:I

    .line 13
    .line 14
    iget v1, p0, La/pzj;->m:I

    .line 15
    .line 16
    iget v2, p0, La/pzj;->k:I

    .line 17
    .line 18
    iget-object p0, p0, La/pzj;->j:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1, v2, v0, v1, p0}, La/xot0;->a(IIILjava/util/ArrayList;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
