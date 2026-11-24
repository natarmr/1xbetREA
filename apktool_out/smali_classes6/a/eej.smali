.class public final synthetic La/eej;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/ranges/IntRange;

.field public final synthetic b:Ljava/util/Locale;

.field public final synthetic c:Ljava/util/Calendar;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/Long;

.field public final synthetic g:Ljava/lang/Long;

.field public final synthetic h:Z

.field public final synthetic i:La/jej;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:La/omv;

.field public final synthetic l:La/egk0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/ranges/IntRange;Ljava/util/Locale;Ljava/util/Calendar;JJLjava/lang/Long;Ljava/lang/Long;ZLa/jej;Lkotlin/jvm/functions/Function1;La/omv;La/egk0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/eej;->a:Lkotlin/ranges/IntRange;

    iput-object p2, p0, La/eej;->b:Ljava/util/Locale;

    iput-object p3, p0, La/eej;->c:Ljava/util/Calendar;

    iput-wide p4, p0, La/eej;->d:J

    iput-wide p6, p0, La/eej;->e:J

    iput-object p8, p0, La/eej;->f:Ljava/lang/Long;

    iput-object p9, p0, La/eej;->g:Ljava/lang/Long;

    iput-boolean p10, p0, La/eej;->h:Z

    iput-object p11, p0, La/eej;->i:La/jej;

    iput-object p12, p0, La/eej;->j:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, La/eej;->k:La/omv;

    iput-object p14, p0, La/eej;->l:La/egk0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/hcz;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, v0, La/eej;->a:Lkotlin/ranges/IntRange;

    .line 11
    .line 12
    move-object/from16 v17, v1

    .line 13
    .line 14
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->M(Ljava/lang/Iterable;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    new-instance v2, La/fej;

    .line 19
    .line 20
    iget-object v4, v0, La/eej;->b:Ljava/util/Locale;

    .line 21
    .line 22
    iget-object v5, v0, La/eej;->c:Ljava/util/Calendar;

    .line 23
    .line 24
    iget-wide v6, v0, La/eej;->d:J

    .line 25
    .line 26
    iget-wide v8, v0, La/eej;->e:J

    .line 27
    .line 28
    iget-object v10, v0, La/eej;->f:Ljava/lang/Long;

    .line 29
    .line 30
    iget-object v11, v0, La/eej;->g:Ljava/lang/Long;

    .line 31
    .line 32
    iget-boolean v12, v0, La/eej;->h:Z

    .line 33
    .line 34
    iget-object v13, v0, La/eej;->i:La/jej;

    .line 35
    .line 36
    iget-object v14, v0, La/eej;->j:Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    iget-object v15, v0, La/eej;->k:La/omv;

    .line 39
    .line 40
    iget-object v0, v0, La/eej;->l:La/egk0;

    .line 41
    .line 42
    move-object/from16 v16, v0

    .line 43
    .line 44
    invoke-direct/range {v2 .. v16}, La/fej;-><init>(Lkotlin/ranges/IntRange;Ljava/util/Locale;Ljava/util/Calendar;JJLjava/lang/Long;Ljava/lang/Long;ZLa/jej;Lkotlin/jvm/functions/Function1;La/omv;La/egk0;)V

    .line 45
    .line 46
    .line 47
    new-instance v4, La/ugd;

    .line 48
    .line 49
    const v0, 0x438d5bd9

    .line 50
    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-direct {v4, v0, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/4 v5, 0x6

    .line 57
    const/4 v2, 0x0

    .line 58
    const/4 v3, 0x0

    .line 59
    move-object/from16 v0, v17

    .line 60
    .line 61
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object v0
.end method
