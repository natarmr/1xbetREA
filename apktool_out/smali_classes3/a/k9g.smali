.class public final synthetic La/k9g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k9g;->a:B

    iput-object p1, p0, La/k9g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k9g;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/k9g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->p:I

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->a:La/yag;

    .line 15
    .line 16
    sget-object v1, La/yag;->d:La/yag;

    .line 17
    .line 18
    if-ne p0, v1, :cond_0

    .line 19
    .line 20
    const p0, 0x7f07074a

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const p0, 0x7f07074b

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_0
    invoke-static {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->e(Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
