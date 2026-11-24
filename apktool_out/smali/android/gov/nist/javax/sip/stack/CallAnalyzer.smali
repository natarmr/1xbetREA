.class public Landroid/gov/nist/javax/sip/stack/CallAnalyzer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/stack/CallAnalyzer$ThreadInfo;,
        Landroid/gov/nist/javax/sip/stack/CallAnalyzer$StackTrace;,
        Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;,
        Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;,
        Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;,
        Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;
    }
.end annotation


# static fields
.field static count:I

.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

.field private stack:Landroid/gov/nist/javax/sip/SipStackImpl;

.field private threadMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Thread;",
            "Ljava/util/HashMap<",
            "Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private timer:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->count:I

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 30
    new-instance v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;-><init>()V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 31
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->timer:Ljava/util/Timer;

    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/SipStackImpl;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 17
    .line 18
    new-instance v0, Ljava/util/Timer;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->timer:Ljava/util/Timer;

    .line 24
    .line 25
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->stack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic access$000(Landroid/gov/nist/javax/sip/stack/CallAnalyzer;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100()Landroid/gov/nist/core/StackLogger;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-object v0
.end method

.method public static main([Ljava/lang/String;)V
    .locals 7

    .line 1
    const/16 p0, 0x3e8

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 13
    .line 14
    const-string v2, "sec"

    .line 15
    .line 16
    invoke-direct {v1, v2}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;

    .line 20
    .line 21
    const-string v3, "se111c"

    .line 22
    .line 23
    invoke-direct {v2, v3}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;

    .line 27
    .line 28
    const/16 v4, 0x1f4

    .line 29
    .line 30
    invoke-direct {v3, v4, v4, v4}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;-><init>(III)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v3}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->configure(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->startAnalysis(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->startAnalysis(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$2;

    .line 43
    .line 44
    invoke-direct {v2, v0, v1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$2;-><init>(Landroid/gov/nist/javax/sip/stack/CallAnalyzer;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    :goto_0
    const v3, 0x1e8480

    .line 49
    .line 50
    .line 51
    if-ge v1, v3, :cond_0

    .line 52
    .line 53
    invoke-interface {p0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 60
    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v3, "size:"

    .line 64
    .line 65
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object v4, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 69
    .line 70
    invoke-interface {v4}, Ljava/util/Map;->size()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v4, " "

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v5, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/util/AbstractMap;->size()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 99
    .line 100
    .line 101
    const-wide/16 v1, 0xc8

    .line 102
    .line 103
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 104
    .line 105
    invoke-interface {p0, v1, v2, v5}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 106
    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 112
    .line 113
    .line 114
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 115
    .line 116
    new-instance v1, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object v2, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 122
    .line 123
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    iget-object v2, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {p0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 150
    .line 151
    .line 152
    const-wide/16 v1, 0x1388

    .line 153
    .line 154
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 155
    .line 156
    .line 157
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 158
    .line 159
    .line 160
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 161
    .line 162
    new-instance v5, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 168
    .line 169
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 180
    .line 181
    invoke-virtual {v6}, Ljava/util/AbstractMap;->size()I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-virtual {p0, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 196
    .line 197
    .line 198
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 202
    .line 203
    .line 204
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 205
    .line 206
    new-instance v5, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 212
    .line 213
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 224
    .line 225
    invoke-virtual {v6}, Ljava/util/AbstractMap;->size()I

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-virtual {p0, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 240
    .line 241
    .line 242
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 243
    .line 244
    .line 245
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 246
    .line 247
    .line 248
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 249
    .line 250
    new-instance v5, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 256
    .line 257
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 268
    .line 269
    invoke-virtual {v6}, Ljava/util/AbstractMap;->size()I

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    invoke-virtual {p0, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 284
    .line 285
    .line 286
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 287
    .line 288
    .line 289
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 290
    .line 291
    .line 292
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 293
    .line 294
    new-instance v5, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 300
    .line 301
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 312
    .line 313
    invoke-virtual {v6}, Ljava/util/AbstractMap;->size()I

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    invoke-virtual {p0, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 328
    .line 329
    .line 330
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 331
    .line 332
    .line 333
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 334
    .line 335
    .line 336
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 337
    .line 338
    new-instance v5, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 344
    .line 345
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 356
    .line 357
    invoke-virtual {v6}, Ljava/util/AbstractMap;->size()I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    invoke-virtual {p0, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 372
    .line 373
    .line 374
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 375
    .line 376
    .line 377
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 378
    .line 379
    .line 380
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 381
    .line 382
    new-instance v1, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    iget-object v2, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 388
    .line 389
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    iget-object v2, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 400
    .line 401
    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-virtual {p0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 416
    .line 417
    .line 418
    iget-object p0, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 419
    .line 420
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 421
    .line 422
    .line 423
    move-result p0

    .line 424
    if-gtz p0, :cond_1

    .line 425
    .line 426
    return-void

    .line 427
    :cond_1
    const-string p0, "Should be zero by this point. Leak."

    .line 428
    .line 429
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    return-void
.end method


# virtual methods
.method public configure(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;->get(Ljava/lang/Object;)Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object p2, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->config:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->isAnalysisStarted(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->startAnalysis(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public enter(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V
    .locals 1

    .line 17
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 18
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->enter(Ljava/lang/Thread;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    return-void
.end method

.method public enter(Ljava/lang/Thread;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->getAttributes(Ljava/lang/Thread;)Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public declared-synchronized getAttributes(Ljava/lang/Thread;)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            ")",
            "Ljava/util/HashMap<",
            "Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 3
    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/util/HashMap;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit p0

    .line 26
    return-object v0

    .line 27
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1
.end method

.method public getCurrentStack(Ljava/lang/Thread;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "\n"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, " "

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    array-length v0, p1

    .line 58
    const/4 v3, 0x0

    .line 59
    :goto_0
    if-ge v3, v0, :cond_0

    .line 60
    .line 61
    aget-object v4, p1, v3

    .line 62
    .line 63
    new-instance v5, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method

.method public getMetricStats(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;->get(Ljava/lang/Object;)Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getNumberOfThreads()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->threadMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getObject(Ljava/lang/Thread;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->getAttributes(Ljava/lang/Thread;)Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getThreadDump()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x1388

    .line 7
    .line 8
    new-array v1, v1, [Ljava/lang/Thread;

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Thread;->enumerate([Ljava/lang/Thread;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v2, :cond_0

    .line 16
    .line 17
    aget-object v4, v1, v3

    .line 18
    .line 19
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->getCurrentStack(Ljava/lang/Thread;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public getTime(Ljava/lang/Thread;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->getAttributes(Ljava/lang/Thread;)Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Long;

    .line 10
    .line 11
    return-object p0
.end method

.method public isAnalysisStarted(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;->get(Ljava/lang/Object;)Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->task:Ljava/util/TimerTask;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public leave(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V
    .locals 1

    .line 83
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 84
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->leave(Ljava/lang/Thread;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    return-void
.end method

.method public leave(Ljava/lang/Thread;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;->get(Ljava/lang/Object;)Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->getAttributes(Ljava/lang/Thread;)Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    sub-long/2addr v1, v3

    .line 26
    iget-object p1, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->totalTime:Ljava/lang/Long;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    add-long/2addr v3, v1

    .line 33
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->totalTime:Ljava/lang/Long;

    .line 38
    .line 39
    iget-object p1, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->numberOfEvents:Ljava/lang/Long;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    const-wide/16 v3, 0x1

    .line 46
    .line 47
    add-long/2addr v1, v3

    .line 48
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->numberOfEvents:Ljava/lang/Long;

    .line 53
    .line 54
    iget-object p1, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->totalTime:Ljava/lang/Long;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    iget-object p1, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->numberOfEvents:Ljava/lang/Long;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    div-long/2addr v1, v3

    .line 67
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->averageTime:Ljava/lang/Long;

    .line 72
    .line 73
    const-wide/high16 v0, -0x8000000000000000L

    .line 74
    .line 75
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public resetStats(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V
    .locals 4

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;->get(Ljava/lang/Object;)Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance p1, Ljava/lang/Long;

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->totalTime:Ljava/lang/Long;

    .line 15
    .line 16
    new-instance p1, Ljava/lang/Long;

    .line 17
    .line 18
    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->numberOfEvents:Ljava/lang/Long;

    .line 22
    .line 23
    new-instance p1, Ljava/lang/Long;

    .line 24
    .line 25
    const-wide/16 v2, 0x1

    .line 26
    .line 27
    invoke-direct {p1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->averageTime:Ljava/lang/Long;

    .line 31
    .line 32
    new-instance p1, Ljava/lang/Long;

    .line 33
    .line 34
    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->lastLoggedEventTime:Ljava/lang/Long;

    .line 38
    .line 39
    return-void
.end method

.method public setObject(Ljava/lang/Thread;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->getAttributes(Ljava/lang/Thread;)Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public startAnalysis(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->stopAnalysis(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->resetStats(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;->get(Ljava/lang/Object;)Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v2, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;

    .line 14
    .line 15
    invoke-direct {v2, p0, v0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$1;-><init>(Landroid/gov/nist/javax/sip/stack/CallAnalyzer;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V

    .line 16
    .line 17
    .line 18
    iput-object v2, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->task:Ljava/util/TimerTask;

    .line 19
    .line 20
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->timer:Ljava/util/Timer;

    .line 21
    .line 22
    iget-object p0, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->config:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;

    .line 23
    .line 24
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;->checkingInterval:Ljava/lang/Long;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    iget-object p0, v0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->config:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;

    .line 31
    .line 32
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricAnalysisConfiguration;->checkingInterval:Ljava/lang/Long;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public stop()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->timer:Ljava/util/Timer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->timer:Ljava/util/Timer;

    .line 8
    .line 9
    return-void
.end method

.method public stopAnalysis(Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReference;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer;->metricStatisticsMap:Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$MetricReferenceMap;->get(Ljava/lang/Object;)Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->task:Ljava/util/TimerTask;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/TimerTask;->cancel()Z

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CallAnalyzer$TImeMetricInfo;->task:Ljava/util/TimerTask;

    .line 16
    .line 17
    :cond_0
    return-void
.end method
