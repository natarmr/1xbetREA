.class public final synthetic La/hej;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/il9;

.field public final synthetic b:Ljava/util/Locale;

.field public final synthetic c:Ljava/util/Calendar;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:Ljava/lang/Long;

.field public final synthetic h:Ljava/lang/Long;

.field public final synthetic i:Z

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Integer;

.field public final synthetic l:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

.field public final synthetic m:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/il9;Ljava/util/Locale;Ljava/util/Calendar;JJJLjava/lang/Long;Ljava/lang/Long;ZILjava/lang/Integer;Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hej;->a:La/il9;

    iput-object p2, p0, La/hej;->b:Ljava/util/Locale;

    iput-object p3, p0, La/hej;->c:Ljava/util/Calendar;

    iput-wide p4, p0, La/hej;->d:J

    iput-wide p6, p0, La/hej;->e:J

    iput-wide p8, p0, La/hej;->f:J

    iput-object p10, p0, La/hej;->g:Ljava/lang/Long;

    iput-object p11, p0, La/hej;->h:Ljava/lang/Long;

    iput-boolean p12, p0, La/hej;->i:Z

    iput p13, p0, La/hej;->j:I

    iput-object p14, p0, La/hej;->k:Ljava/lang/Integer;

    iput-object p15, p0, La/hej;->l:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    move-object/from16 p1, p16

    iput-object p1, p0, La/hej;->m:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v16, p1

    .line 4
    .line 5
    check-cast v16, La/fet;

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
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-static {v1}, La/x8x;->L(I)I

    .line 17
    .line 18
    .line 19
    move-result v17

    .line 20
    iget-object v1, v0, La/hej;->a:La/il9;

    .line 21
    .line 22
    move-object v2, v1

    .line 23
    iget-object v1, v0, La/hej;->b:Ljava/util/Locale;

    .line 24
    .line 25
    move-object v3, v2

    .line 26
    iget-object v2, v0, La/hej;->c:Ljava/util/Calendar;

    .line 27
    .line 28
    move-object v5, v3

    .line 29
    iget-wide v3, v0, La/hej;->d:J

    .line 30
    .line 31
    move-object v7, v5

    .line 32
    iget-wide v5, v0, La/hej;->e:J

    .line 33
    .line 34
    move-object v9, v7

    .line 35
    iget-wide v7, v0, La/hej;->f:J

    .line 36
    .line 37
    move-object v10, v9

    .line 38
    iget-object v9, v0, La/hej;->g:Ljava/lang/Long;

    .line 39
    .line 40
    move-object v11, v10

    .line 41
    iget-object v10, v0, La/hej;->h:Ljava/lang/Long;

    .line 42
    .line 43
    move-object v12, v11

    .line 44
    iget-boolean v11, v0, La/hej;->i:Z

    .line 45
    .line 46
    move-object v13, v12

    .line 47
    iget v12, v0, La/hej;->j:I

    .line 48
    .line 49
    move-object v14, v13

    .line 50
    iget-object v13, v0, La/hej;->k:Ljava/lang/Integer;

    .line 51
    .line 52
    move-object v15, v14

    .line 53
    iget-object v14, v0, La/hej;->l:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 54
    .line 55
    iget-object v0, v0, La/hej;->m:Lkotlin/jvm/functions/Function2;

    .line 56
    .line 57
    move-object/from16 v18, v15

    .line 58
    .line 59
    move-object v15, v0

    .line 60
    move-object/from16 v0, v18

    .line 61
    .line 62
    invoke-static/range {v0 .. v17}, La/sj3;->a(La/il9;Ljava/util/Locale;Ljava/util/Calendar;JJJLjava/lang/Long;Ljava/lang/Long;ZILjava/lang/Integer;Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0
.end method
