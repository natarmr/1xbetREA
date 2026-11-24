.class public final synthetic La/ss50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:La/fqm;

.field public final synthetic d:I

.field public final synthetic e:La/xdr;

.field public final synthetic f:Lkotlin/jvm/functions/Function2;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:I

.field public final synthetic j:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;La/fqm;ILa/xdr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ss50;->a:Ljava/util/ArrayList;

    iput-object p2, p0, La/ss50;->b:Ljava/util/ArrayList;

    iput-object p3, p0, La/ss50;->c:La/fqm;

    iput p4, p0, La/ss50;->d:I

    iput-object p5, p0, La/ss50;->e:La/xdr;

    iput-object p6, p0, La/ss50;->f:Lkotlin/jvm/functions/Function2;

    iput-object p7, p0, La/ss50;->g:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, La/ss50;->h:Lkotlin/jvm/functions/Function1;

    iput p9, p0, La/ss50;->i:I

    iput-object p10, p0, La/ss50;->j:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/hcz;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v1, La/rbg;

    .line 8
    .line 9
    iget-object v2, p0, La/ss50;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v3, p0, La/ss50;->c:La/fqm;

    .line 12
    .line 13
    iget v4, p0, La/ss50;->d:I

    .line 14
    .line 15
    iget-object v5, p0, La/ss50;->e:La/xdr;

    .line 16
    .line 17
    iget-object v6, p0, La/ss50;->f:Lkotlin/jvm/functions/Function2;

    .line 18
    .line 19
    iget-object v7, p0, La/ss50;->g:Lkotlin/jvm/functions/Function0;

    .line 20
    .line 21
    iget-object v8, p0, La/ss50;->h:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    invoke-direct/range {v1 .. v8}, La/rbg;-><init>(Ljava/util/ArrayList;La/fqm;ILa/xdr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, La/ugd;

    .line 27
    .line 28
    const v2, 0x687bdc75

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {p1, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x3

    .line 37
    invoke-static {v0, v11, v11, p1, v12}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 38
    .line 39
    .line 40
    iget-object v6, p0, La/ss50;->a:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    move-object v8, v5

    .line 47
    new-instance v5, La/y1l;

    .line 48
    .line 49
    const/4 v10, 0x1

    .line 50
    iget v7, p0, La/ss50;->i:I

    .line 51
    .line 52
    iget-object v9, p0, La/ss50;->j:Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    invoke-direct/range {v5 .. v10}, La/y1l;-><init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    new-instance v4, La/ugd;

    .line 58
    .line 59
    const p0, -0x26bea82

    .line 60
    .line 61
    .line 62
    invoke-direct {v4, p0, v3, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/4 v5, 0x6

    .line 66
    const/4 v2, 0x0

    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 69
    .line 70
    .line 71
    sget-object p0, La/eeq;->i:La/ugd;

    .line 72
    .line 73
    invoke-static {v0, v11, v11, p0, v12}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0
.end method
