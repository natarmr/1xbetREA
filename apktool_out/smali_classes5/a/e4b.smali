.class public final synthetic La/e4b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Z

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:La/ugd;

.field public final synthetic g:La/xdr;

.field public final synthetic h:La/xdr;


# direct methods
.method public synthetic constructor <init>(La/mm40;ZFFFLa/ugd;La/xdr;La/xdr;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/e4b;->a:La/mm40;

    iput-boolean p2, p0, La/e4b;->b:Z

    iput p3, p0, La/e4b;->c:F

    iput p4, p0, La/e4b;->d:F

    iput p5, p0, La/e4b;->e:F

    iput-object p6, p0, La/e4b;->f:La/ugd;

    iput-object p7, p0, La/e4b;->g:La/xdr;

    iput-object p8, p0, La/e4b;->h:La/xdr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p1, 0x30001

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, La/x8x;->L(I)I

    .line 13
    .line 14
    .line 15
    move-result v9

    .line 16
    iget-object v0, p0, La/e4b;->a:La/mm40;

    .line 17
    .line 18
    iget-boolean v1, p0, La/e4b;->b:Z

    .line 19
    .line 20
    iget v2, p0, La/e4b;->c:F

    .line 21
    .line 22
    iget v3, p0, La/e4b;->d:F

    .line 23
    .line 24
    iget v4, p0, La/e4b;->e:F

    .line 25
    .line 26
    iget-object v5, p0, La/e4b;->f:La/ugd;

    .line 27
    .line 28
    iget-object v6, p0, La/e4b;->g:La/xdr;

    .line 29
    .line 30
    iget-object v7, p0, La/e4b;->h:La/xdr;

    .line 31
    .line 32
    invoke-static/range {v0 .. v9}, La/cwr0;->l(La/mm40;ZFFFLa/ugd;La/xdr;La/xdr;La/fet;I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0
.end method
