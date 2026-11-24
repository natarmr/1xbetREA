.class public final synthetic La/pbc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:La/m0x;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:Ljava/lang/Integer;

.field public final synthetic h:Ljava/lang/Boolean;

.field public final synthetic i:Z

.field public final synthetic j:Lkotlin/jvm/functions/Function0;

.field public final synthetic k:La/xdr;

.field public final synthetic l:La/xdr;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;La/m0x;JZJJLjava/lang/Integer;Ljava/lang/Boolean;ZLkotlin/jvm/functions/Function0;La/xdr;La/xdr;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/pbc;->a:Ljava/lang/String;

    iput-object p2, p0, La/pbc;->b:La/m0x;

    iput-wide p3, p0, La/pbc;->c:J

    iput-boolean p5, p0, La/pbc;->d:Z

    iput-wide p6, p0, La/pbc;->e:J

    iput-wide p8, p0, La/pbc;->f:J

    iput-object p10, p0, La/pbc;->g:Ljava/lang/Integer;

    iput-object p11, p0, La/pbc;->h:Ljava/lang/Boolean;

    iput-boolean p12, p0, La/pbc;->i:Z

    iput-object p13, p0, La/pbc;->j:Lkotlin/jvm/functions/Function0;

    iput-object p14, p0, La/pbc;->k:La/xdr;

    iput-object p15, p0, La/pbc;->l:La/xdr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    check-cast v15, La/fet;

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
    const/4 v1, 0x1

    .line 15
    invoke-static {v1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v16

    .line 19
    iget-object v1, v0, La/pbc;->a:Ljava/lang/String;

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    iget-object v1, v0, La/pbc;->b:La/m0x;

    .line 23
    .line 24
    move-object v4, v2

    .line 25
    iget-wide v2, v0, La/pbc;->c:J

    .line 26
    .line 27
    move-object v5, v4

    .line 28
    iget-boolean v4, v0, La/pbc;->d:Z

    .line 29
    .line 30
    move-object v7, v5

    .line 31
    iget-wide v5, v0, La/pbc;->e:J

    .line 32
    .line 33
    move-object v9, v7

    .line 34
    iget-wide v7, v0, La/pbc;->f:J

    .line 35
    .line 36
    move-object v10, v9

    .line 37
    iget-object v9, v0, La/pbc;->g:Ljava/lang/Integer;

    .line 38
    .line 39
    move-object v11, v10

    .line 40
    iget-object v10, v0, La/pbc;->h:Ljava/lang/Boolean;

    .line 41
    .line 42
    move-object v12, v11

    .line 43
    iget-boolean v11, v0, La/pbc;->i:Z

    .line 44
    .line 45
    move-object v13, v12

    .line 46
    iget-object v12, v0, La/pbc;->j:Lkotlin/jvm/functions/Function0;

    .line 47
    .line 48
    move-object v14, v13

    .line 49
    iget-object v13, v0, La/pbc;->k:La/xdr;

    .line 50
    .line 51
    iget-object v0, v0, La/pbc;->l:La/xdr;

    .line 52
    .line 53
    move-object/from16 v17, v14

    .line 54
    .line 55
    move-object v14, v0

    .line 56
    move-object/from16 v0, v17

    .line 57
    .line 58
    invoke-static/range {v0 .. v16}, La/qbc;->c(Ljava/lang/String;La/m0x;JZJJLjava/lang/Integer;Ljava/lang/Boolean;ZLkotlin/jvm/functions/Function0;La/xdr;La/xdr;La/fet;I)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object v0
.end method
