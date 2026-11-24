.class public final La/vck;
.super La/hdk;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final k:La/wck;


# direct methods
.method public constructor <init>(La/wck;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/hdk;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vck;->k:La/wck;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B()La/rdk;
    .locals 0

    .line 1
    iget-object p0, p0, La/vck;->k:La/wck;

    .line 2
    .line 3
    return-object p0
.end method

.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/vck;->k:La/wck;

    .line 2
    .line 3
    iget-object p0, p0, La/wck;->r:La/a8z;

    .line 4
    .line 5
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/vck;

    .line 10
    .line 11
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method

.method public final c()La/iiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/vck;->k:La/wck;

    .line 2
    .line 3
    return-object p0
.end method
