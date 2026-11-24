.class public final synthetic La/hqm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/a4x;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:La/ywh0;

.field public final synthetic f:La/ugg0;

.field public final synthetic g:La/y9q0;

.field public final synthetic h:I

.field public final synthetic i:La/ugg0;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:S


# direct methods
.method public synthetic constructor <init>(La/mm40;La/a4x;FFLa/ywh0;La/ugg0;La/y9q0;ILa/ugg0;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hqm;->a:La/mm40;

    iput-object p2, p0, La/hqm;->b:La/a4x;

    iput p3, p0, La/hqm;->c:F

    iput p4, p0, La/hqm;->d:F

    iput-object p5, p0, La/hqm;->e:La/ywh0;

    iput-object p6, p0, La/hqm;->f:La/ugg0;

    iput-object p7, p0, La/hqm;->g:La/y9q0;

    iput p8, p0, La/hqm;->h:I

    iput-object p9, p0, La/hqm;->i:La/ugg0;

    iput-object p10, p0, La/hqm;->j:Lkotlin/jvm/functions/Function1;

    iput p11, p0, La/hqm;->k:I

    iput p12, p0, La/hqm;->l:I

    iput-short p13, p0, La/hqm;->m:S

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, La/fet;

    .line 3
    .line 4
    move-object/from16 v0, p2

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget v0, p0, La/hqm;->k:I

    .line 12
    .line 13
    or-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-static {v0}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v11

    .line 19
    iget v0, p0, La/hqm;->l:I

    .line 20
    .line 21
    invoke-static {v0}, La/x8x;->L(I)I

    .line 22
    .line 23
    .line 24
    move-result v12

    .line 25
    iget-object v0, p0, La/hqm;->a:La/mm40;

    .line 26
    .line 27
    iget-object v1, p0, La/hqm;->b:La/a4x;

    .line 28
    .line 29
    iget v2, p0, La/hqm;->c:F

    .line 30
    .line 31
    iget v3, p0, La/hqm;->d:F

    .line 32
    .line 33
    iget-object v4, p0, La/hqm;->e:La/ywh0;

    .line 34
    .line 35
    iget-object v5, p0, La/hqm;->f:La/ugg0;

    .line 36
    .line 37
    iget-object v6, p0, La/hqm;->g:La/y9q0;

    .line 38
    .line 39
    iget v7, p0, La/hqm;->h:I

    .line 40
    .line 41
    iget-object v8, p0, La/hqm;->i:La/ugg0;

    .line 42
    .line 43
    iget-object v9, p0, La/hqm;->j:Lkotlin/jvm/functions/Function1;

    .line 44
    .line 45
    iget-short v13, p0, La/hqm;->m:S

    .line 46
    .line 47
    invoke-static/range {v0 .. v13}, La/ibc;->H(La/mm40;La/a4x;FFLa/ywh0;La/ugg0;La/y9q0;ILa/ugg0;Lkotlin/jvm/functions/Function1;La/fet;III)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0
.end method
