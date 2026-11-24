.class public final synthetic La/nbz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/xk80;

.field public final synthetic c:La/hh80;

.field public final synthetic d:La/afk0;

.field public final synthetic e:Z

.field public final synthetic f:La/vf80;

.field public final synthetic g:I

.field public final synthetic h:F

.field public final synthetic i:La/yi80;

.field public final synthetic j:La/vj50;

.field public final synthetic k:Lkotlin/jvm/functions/Function1;

.field public final synthetic l:La/yx7;

.field public final synthetic m:La/ifk0;

.field public final synthetic n:La/ugd;

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/xk80;La/hh80;La/afk0;ZLa/vf80;IFLa/yi80;La/vj50;Lkotlin/jvm/functions/Function1;La/yx7;La/ifk0;La/ugd;II)V
    .locals 1

    .line 1
    sget-object v0, La/ma80;->a:La/ma80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nbz;->a:La/mm40;

    iput-object p2, p0, La/nbz;->b:La/xk80;

    iput-object p3, p0, La/nbz;->c:La/hh80;

    iput-object p4, p0, La/nbz;->d:La/afk0;

    iput-boolean p5, p0, La/nbz;->e:Z

    iput-object p6, p0, La/nbz;->f:La/vf80;

    iput p7, p0, La/nbz;->g:I

    iput p8, p0, La/nbz;->h:F

    iput-object p9, p0, La/nbz;->i:La/yi80;

    iput-object p10, p0, La/nbz;->j:La/vj50;

    iput-object p11, p0, La/nbz;->k:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, La/nbz;->l:La/yx7;

    iput-object p13, p0, La/nbz;->m:La/ifk0;

    iput-object p14, p0, La/nbz;->n:La/ugd;

    move/from16 p1, p15

    iput p1, p0, La/nbz;->o:I

    move/from16 p1, p16

    iput p1, p0, La/nbz;->p:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/ma80;->a:La/ma80;

    .line 4
    .line 5
    move-object/from16 v16, p1

    .line 6
    .line 7
    check-cast v16, La/fet;

    .line 8
    .line 9
    move-object/from16 v1, p2

    .line 10
    .line 11
    check-cast v1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v1, v0, La/nbz;->o:I

    .line 17
    .line 18
    or-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    invoke-static {v1}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result v17

    .line 24
    iget v1, v0, La/nbz;->p:I

    .line 25
    .line 26
    invoke-static {v1}, La/x8x;->L(I)I

    .line 27
    .line 28
    .line 29
    move-result v18

    .line 30
    iget-object v2, v0, La/nbz;->a:La/mm40;

    .line 31
    .line 32
    iget-object v3, v0, La/nbz;->b:La/xk80;

    .line 33
    .line 34
    iget-object v4, v0, La/nbz;->c:La/hh80;

    .line 35
    .line 36
    iget-object v5, v0, La/nbz;->d:La/afk0;

    .line 37
    .line 38
    iget-boolean v6, v0, La/nbz;->e:Z

    .line 39
    .line 40
    iget-object v7, v0, La/nbz;->f:La/vf80;

    .line 41
    .line 42
    iget v8, v0, La/nbz;->g:I

    .line 43
    .line 44
    iget v9, v0, La/nbz;->h:F

    .line 45
    .line 46
    iget-object v10, v0, La/nbz;->i:La/yi80;

    .line 47
    .line 48
    iget-object v11, v0, La/nbz;->j:La/vj50;

    .line 49
    .line 50
    iget-object v12, v0, La/nbz;->k:Lkotlin/jvm/functions/Function1;

    .line 51
    .line 52
    iget-object v13, v0, La/nbz;->l:La/yx7;

    .line 53
    .line 54
    iget-object v14, v0, La/nbz;->m:La/ifk0;

    .line 55
    .line 56
    iget-object v15, v0, La/nbz;->n:La/ugd;

    .line 57
    .line 58
    invoke-static/range {v2 .. v18}, La/w9x;->i(La/mm40;La/xk80;La/hh80;La/afk0;ZLa/vf80;IFLa/yi80;La/vj50;Lkotlin/jvm/functions/Function1;La/yx7;La/ifk0;La/ugd;La/fet;II)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object v0
.end method
