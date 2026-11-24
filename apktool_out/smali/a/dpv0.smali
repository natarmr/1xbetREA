.class public final synthetic La/dpv0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements La/aer;


# static fields
.field public static final a:La/dpv0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/dpv0;

    .line 2
    .line 3
    const-string v4, "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x6

    .line 7
    const-class v2, La/epv0;

    .line 8
    .line 9
    const-string v3, "createSchedulers"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/dpv0;->a:La/dpv0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Landroid/content/Context;

    .line 2
    .line 3
    check-cast p2, La/wsd;

    .line 4
    .line 5
    check-cast p3, La/fpv0;

    .line 6
    .line 7
    check-cast p4, Landroidx/work/impl/WorkDatabase;

    .line 8
    .line 9
    check-cast p5, La/lds0;

    .line 10
    .line 11
    check-cast p6, La/ezb0;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object p0, La/m2h0;->a:Ljava/lang/String;

    .line 33
    .line 34
    new-instance p0, La/x9o0;

    .line 35
    .line 36
    invoke-direct {p0, p1, p4, p2}, La/x9o0;-><init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;La/wsd;)V

    .line 37
    .line 38
    .line 39
    sget-object p4, La/vg80;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v1, Landroid/content/ComponentName;

    .line 49
    .line 50
    const-class v2, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 51
    .line 52
    invoke-direct {v1, p1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 53
    .line 54
    .line 55
    sget-object v2, La/ug80;->a:La/ug80;

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    invoke-static {p4, v1, v3, v2}, La/vg80;->a(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;ZLkotlin/jvm/functions/Function2;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    sget-object v1, La/m2h0;->a:Ljava/lang/String;

    .line 66
    .line 67
    const-string v2, "Created SystemJobScheduler and enabled SystemJobService"

    .line 68
    .line 69
    invoke-virtual {p4, v1, v2}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    new-instance p0, La/ufv;

    .line 76
    .line 77
    move-object p4, p6

    .line 78
    move-object p6, p3

    .line 79
    move-object p3, p5

    .line 80
    new-instance p5, La/okt0;

    .line 81
    .line 82
    invoke-direct {p5, p4, p6}, La/okt0;-><init>(La/ezb0;La/fpv0;)V

    .line 83
    .line 84
    .line 85
    invoke-direct/range {p0 .. p6}, La/ufv;-><init>(Landroid/content/Context;La/wsd;La/lds0;La/ezb0;La/okt0;La/fpv0;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
.end method
