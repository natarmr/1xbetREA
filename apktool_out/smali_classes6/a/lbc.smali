.class public final synthetic La/lbc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:La/n0x;

.field public final synthetic c:Z

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:La/y3d;

.field public final synthetic g:Ljava/lang/Boolean;

.field public final synthetic h:Z

.field public final synthetic i:Lkotlin/jvm/functions/Function0;

.field public final synthetic j:La/xdr;

.field public final synthetic k:La/xdr;

.field public final synthetic l:S


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;La/n0x;ZJJLa/y3d;Ljava/lang/Boolean;ZLkotlin/jvm/functions/Function0;La/xdr;La/xdr;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lbc;->a:Ljava/lang/String;

    iput-object p2, p0, La/lbc;->b:La/n0x;

    iput-boolean p3, p0, La/lbc;->c:Z

    iput-wide p4, p0, La/lbc;->d:J

    iput-wide p6, p0, La/lbc;->e:J

    iput-object p8, p0, La/lbc;->f:La/y3d;

    iput-object p9, p0, La/lbc;->g:Ljava/lang/Boolean;

    iput-boolean p10, p0, La/lbc;->h:Z

    iput-object p11, p0, La/lbc;->i:Lkotlin/jvm/functions/Function0;

    iput-object p12, p0, La/lbc;->j:La/xdr;

    iput-object p13, p0, La/lbc;->k:La/xdr;

    iput-short p15, p0, La/lbc;->l:S

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    check-cast v13, La/fet;

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
    move-result v14

    .line 19
    iget-object v1, v0, La/lbc;->a:Ljava/lang/String;

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    iget-object v1, v0, La/lbc;->b:La/n0x;

    .line 23
    .line 24
    move-object v3, v2

    .line 25
    iget-boolean v2, v0, La/lbc;->c:Z

    .line 26
    .line 27
    move-object v5, v3

    .line 28
    iget-wide v3, v0, La/lbc;->d:J

    .line 29
    .line 30
    move-object v7, v5

    .line 31
    iget-wide v5, v0, La/lbc;->e:J

    .line 32
    .line 33
    move-object v8, v7

    .line 34
    iget-object v7, v0, La/lbc;->f:La/y3d;

    .line 35
    .line 36
    move-object v9, v8

    .line 37
    iget-object v8, v0, La/lbc;->g:Ljava/lang/Boolean;

    .line 38
    .line 39
    move-object v10, v9

    .line 40
    iget-boolean v9, v0, La/lbc;->h:Z

    .line 41
    .line 42
    move-object v11, v10

    .line 43
    iget-object v10, v0, La/lbc;->i:Lkotlin/jvm/functions/Function0;

    .line 44
    .line 45
    move-object v12, v11

    .line 46
    iget-object v11, v0, La/lbc;->j:La/xdr;

    .line 47
    .line 48
    move-object v15, v12

    .line 49
    iget-object v12, v0, La/lbc;->k:La/xdr;

    .line 50
    .line 51
    iget-short v0, v0, La/lbc;->l:S

    .line 52
    .line 53
    move-object/from16 v16, v15

    .line 54
    .line 55
    move v15, v0

    .line 56
    move-object/from16 v0, v16

    .line 57
    .line 58
    invoke-static/range {v0 .. v15}, La/mbc;->a(Ljava/lang/String;La/n0x;ZJJLa/y3d;Ljava/lang/Boolean;ZLkotlin/jvm/functions/Function0;La/xdr;La/xdr;La/fet;II)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object v0
.end method
