.class public final synthetic La/qjl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:B

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:La/ugd;

.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(La/mm40;IFFLa/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qjl;->a:La/mm40;

    iput-byte p2, p0, La/qjl;->b:B

    iput p3, p0, La/qjl;->c:F

    iput p4, p0, La/qjl;->d:F

    iput-object p5, p0, La/qjl;->e:La/ugd;

    iput-byte p7, p0, La/qjl;->f:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/16 p1, 0x6001

    .line 10
    .line 11
    invoke-static {p1}, La/x8x;->L(I)I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    iget-object v0, p0, La/qjl;->a:La/mm40;

    .line 16
    .line 17
    iget-byte v1, p0, La/qjl;->b:B

    .line 18
    .line 19
    iget v2, p0, La/qjl;->c:F

    .line 20
    .line 21
    iget v3, p0, La/qjl;->d:F

    .line 22
    .line 23
    iget-object v4, p0, La/qjl;->e:La/ugd;

    .line 24
    .line 25
    iget-byte v7, p0, La/qjl;->f:B

    .line 26
    .line 27
    invoke-static/range {v0 .. v7}, La/jeb;->o(La/mm40;IFFLa/ugd;La/fet;II)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method
