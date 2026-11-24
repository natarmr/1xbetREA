.class public final synthetic La/avm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/kz20;

.field public final synthetic c:La/mbh0;

.field public final synthetic d:Z

.field public final synthetic e:La/cfq;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:La/ugd;

.field public final synthetic h:La/ugd;

.field public final synthetic i:La/ugd;

.field public final synthetic j:La/xdr;

.field public final synthetic k:La/xdr;

.field public final synthetic l:I

.field public final synthetic m:B

.field public final synthetic n:S


# direct methods
.method public synthetic constructor <init>(La/mm40;La/kz20;La/mbh0;ZLa/cfq;Lkotlin/jvm/functions/Function1;La/ugd;La/ugd;La/ugd;La/xdr;La/xdr;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/avm0;->a:La/mm40;

    iput-object p2, p0, La/avm0;->b:La/kz20;

    iput-object p3, p0, La/avm0;->c:La/mbh0;

    iput-boolean p4, p0, La/avm0;->d:Z

    iput-object p5, p0, La/avm0;->e:La/cfq;

    iput-object p6, p0, La/avm0;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/avm0;->g:La/ugd;

    iput-object p8, p0, La/avm0;->h:La/ugd;

    iput-object p9, p0, La/avm0;->i:La/ugd;

    iput-object p10, p0, La/avm0;->j:La/xdr;

    iput-object p11, p0, La/avm0;->k:La/xdr;

    iput p12, p0, La/avm0;->l:I

    iput-byte p13, p0, La/avm0;->m:B

    iput-short p14, p0, La/avm0;->n:S

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    check-cast v11, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget v1, v0, La/avm0;->l:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v12

    .line 22
    iget-byte v1, v0, La/avm0;->m:B

    .line 23
    .line 24
    invoke-static {v1}, La/x8x;->L(I)I

    .line 25
    .line 26
    .line 27
    move-result v13

    .line 28
    iget-object v1, v0, La/avm0;->a:La/mm40;

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    iget-object v1, v0, La/avm0;->b:La/kz20;

    .line 32
    .line 33
    move-object v3, v2

    .line 34
    iget-object v2, v0, La/avm0;->c:La/mbh0;

    .line 35
    .line 36
    move-object v4, v3

    .line 37
    iget-boolean v3, v0, La/avm0;->d:Z

    .line 38
    .line 39
    move-object v5, v4

    .line 40
    iget-object v4, v0, La/avm0;->e:La/cfq;

    .line 41
    .line 42
    move-object v6, v5

    .line 43
    iget-object v5, v0, La/avm0;->f:Lkotlin/jvm/functions/Function1;

    .line 44
    .line 45
    move-object v7, v6

    .line 46
    iget-object v6, v0, La/avm0;->g:La/ugd;

    .line 47
    .line 48
    move-object v8, v7

    .line 49
    iget-object v7, v0, La/avm0;->h:La/ugd;

    .line 50
    .line 51
    move-object v9, v8

    .line 52
    iget-object v8, v0, La/avm0;->i:La/ugd;

    .line 53
    .line 54
    move-object v10, v9

    .line 55
    iget-object v9, v0, La/avm0;->j:La/xdr;

    .line 56
    .line 57
    move-object v14, v10

    .line 58
    iget-object v10, v0, La/avm0;->k:La/xdr;

    .line 59
    .line 60
    iget-short v0, v0, La/avm0;->n:S

    .line 61
    .line 62
    move-object v15, v14

    .line 63
    move v14, v0

    .line 64
    move-object v0, v15

    .line 65
    invoke-static/range {v0 .. v14}, La/cvm0;->a(La/mm40;La/kz20;La/mbh0;ZLa/cfq;Lkotlin/jvm/functions/Function1;La/ugd;La/ugd;La/ugd;La/xdr;La/xdr;La/fet;III)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0
.end method
