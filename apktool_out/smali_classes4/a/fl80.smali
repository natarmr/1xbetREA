.class public final La/fl80;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:La/nh70;

.field public static final f:La/jh70;


# instance fields
.field public final a:La/gmq;

.field public final b:La/w6t0;

.field public final c:La/zxv;

.field public final d:Lkotlin/jvm/functions/Function0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/nh70;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/fl80;->e:La/nh70;

    .line 7
    .line 8
    new-instance v0, La/jh70;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/fl80;->f:La/jh70;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(La/gmq;La/w6t0;La/zxv;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/fl80;->a:La/gmq;

    .line 11
    .line 12
    iput-object p2, p0, La/fl80;->b:La/w6t0;

    .line 13
    .line 14
    iput-object p3, p0, La/fl80;->c:La/zxv;

    .line 15
    .line 16
    iput-object p4, p0, La/fl80;->d:Lkotlin/jvm/functions/Function0;

    .line 17
    .line 18
    return-void
.end method
