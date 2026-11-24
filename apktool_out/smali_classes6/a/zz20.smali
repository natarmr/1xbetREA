.class public final synthetic La/zz20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/hh80;

.field public final synthetic d:La/xcz;

.field public final synthetic e:La/ugd;

.field public final synthetic f:La/ugd;

.field public final synthetic g:La/ugd;

.field public final synthetic h:La/ugd;

.field public final synthetic i:La/ugd;

.field public final synthetic j:I

.field public final synthetic k:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;La/hh80;La/xcz;La/ugd;La/ugd;La/ugd;La/ugd;La/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zz20;->a:La/mm40;

    iput-object p2, p0, La/zz20;->b:La/l7m0;

    iput-object p3, p0, La/zz20;->c:La/hh80;

    iput-object p4, p0, La/zz20;->d:La/xcz;

    iput-object p5, p0, La/zz20;->e:La/ugd;

    iput-object p6, p0, La/zz20;->f:La/ugd;

    iput-object p7, p0, La/zz20;->g:La/ugd;

    iput-object p8, p0, La/zz20;->h:La/ugd;

    iput-object p9, p0, La/zz20;->i:La/ugd;

    iput p10, p0, La/zz20;->j:I

    iput-byte p11, p0, La/zz20;->k:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/zz20;->j:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-object v0, p0, La/zz20;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/zz20;->b:La/l7m0;

    .line 20
    .line 21
    iget-object v2, p0, La/zz20;->c:La/hh80;

    .line 22
    .line 23
    iget-object v3, p0, La/zz20;->d:La/xcz;

    .line 24
    .line 25
    iget-object v4, p0, La/zz20;->e:La/ugd;

    .line 26
    .line 27
    iget-object v5, p0, La/zz20;->f:La/ugd;

    .line 28
    .line 29
    iget-object v6, p0, La/zz20;->g:La/ugd;

    .line 30
    .line 31
    iget-object v7, p0, La/zz20;->h:La/ugd;

    .line 32
    .line 33
    iget-object v8, p0, La/zz20;->i:La/ugd;

    .line 34
    .line 35
    iget-byte v11, p0, La/zz20;->k:B

    .line 36
    .line 37
    invoke-static/range {v0 .. v11}, La/c030;->a(La/mm40;La/l7m0;La/hh80;La/xcz;La/ugd;La/ugd;La/ugd;La/ugd;La/ugd;La/fet;II)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method
